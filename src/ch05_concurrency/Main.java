package ch05_concurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Main {

	// In java a thread can be created by extending the class java.lang.Thread
	// or by implementing the functional interface java.lang.Runnable which has the abstract method run()
	// states of a thread => new, runnable, blocked/waiting, terminated
	// methods of a thread => start(), yield(), sleep(), run()
	// But extending the class Thread is not a good practice, most of people implement the interface runnable or callable
	// When the thread has been instantied but not started, the thread is said to be in the state 'NEW'. Once the start() method 
	// is called, the thread is 'RUNNABLE'. The thread is in the state "TERMINATED" (no longer alive) after the run() method completes.
	
	// StringBuffer is Thread-safe, StringBuilder is not Thread-safe. In return, StringBuilder is a little bit faster
	// Deadlock occurs when 2 threads are blocked, with each waiting for the other's lock
	// The object class has 3 methods wait(), notify(), notifyAll() that help threads communicated about the status of an event that the threads care about
	
	// DeadLock
	// It occurs when 2 or more threads are blocked forever, each waiting on the other.
	// How do you fix a deadlock once it has occurred? The answer is that you cannot in most situations.
	// On the other hand, there are numerous strategies to help prevent deadlocks from ever happening in the first place.
	// One common strategy to avoid deadlocks is for all threads to order their resource requests.
	
	// Starvation
	// It occurs when a single thread is perpetually denied access to shared resource or lock.
	// The thread is still active, but it is unable to complete its work as a result of other threads
	// constantly taking the resource that they trying to access
	
	// LiveLock
	// It occurs when 2 or more threads are conceptually blocked forever, although they are each still active 
	// and trying to complete their task.
	// 
	// Semaphore
	// Barrier
	// ConcurrentHashMap
	// ThreadLocal
	//Reentrant
	// newFixedThreadPool, newCachedThreadPool, newSingleThreadExecutor, newScheduledThreadPool
	// Callable and Future
	// Check the method yield() and join() ==> TODO
	
	
	public static void test0() throws InterruptedException {
		//A Thread implements the functional interface Runnable or inherits from the class Thread
		//A task is a single unit of work performed by a thread
		//fire and forget => as once it is submitted, the results are not directly available to the calling thread
		class PrintData implements Runnable {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " - Printing record : " + i);
				}
			}
		}
		//The next lines are executed in an unknown order
		System.out.println("Begin");
		(new Thread(new PrintData())).start();
		(new Thread(new PrintData())).start();
		System.out.println("End");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//The next lines are executed always the same order
		System.out.println("Begin");
		(new Thread(new PrintData())).run();
		(new Thread(new PrintData())).run();
		System.out.println("End");
	}
	
	static int counter = 0;
	
	public static void test1() throws InterruptedException {
		
		new Thread(() -> {
			for(int i = 0; i < 5000000; i++) {
				counter++;
			}
		}).start();
		
		while(counter < 1_000_000) {
			System.out.println("Not reached yet : " + counter);
		}
		System.out.println("Reached!");
		Thread.sleep(1000);
		System.out.println("CheckResults.counter : " + counter);
		Thread.sleep(1000);
	}
	
	public static void test2() throws InterruptedException {
		//Expose the states
		class SimpleThread implements Runnable {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("Hello : "+ Thread.currentThread().getName());
				}
			}
		}
		
		Thread t1 = new Thread(new SimpleThread());
		Thread t2 = new Thread(new SimpleThread());
		System.out.println(t1.getName() + ", " + t1.getState());
		t1.start();
		System.out.println(t2.getName() + ", " + t2.getState());
		t2.start();
		System.out.println(t1.getName() + ", " + t1.getState());
		System.out.println(t2.getName() + ", " + t2.getState());
		Thread.sleep(100);
		System.out.println(t1.getName() + ", " + t1.getState());
		System.out.println(t2.getName() + ", " + t2.getState());
	}
	
	//newSingleThreadExecutor
	public static void test10() throws InterruptedException {
		
		System.out.println("AvailableProcessors : " + Runtime.getRuntime().availableProcessors()); //8
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		long start = System.currentTimeMillis();
		service.execute(()->{
			for(int i = 0; i < 500; i++) {
				System.out.println("i : " + i);
			}
			//
		});
		service.shutdownNow();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	//newSingleThreadExecutor #2
	public static void test11() throws InterruptedException {
		final ExecutorService service2 = Executors.newSingleThreadExecutor();
		
		System.out.println(Thread.currentThread().getName() + " - Begin");
		service2.execute(()-> {
			for(int i = 0; i < 100; i++) {
				System.out.println("***** " + Thread.currentThread().getName() + " - Print : " + i + " *****");
				System.out.println("isShutdown : " + service2.isShutdown());		
				System.out.println("isTerminated : " + service2.isTerminated());
			}
		});
		System.out.println("isShutdown : " + service2.isShutdown());		
		System.out.println("isTerminated : " + service2.isTerminated());
		service2.shutdown();
		System.out.println(Thread.currentThread().getName() + " - End");
		Thread.sleep(1000);
		System.out.println("isShutdown : " + service2.isShutdown());		
		System.out.println("isTerminated : " + service2.isTerminated());
	}
	
	public static void main(String[] args) throws InterruptedException {
		//Basics
		test0();
		
		test1();
		
		test2();
		
		//ThreadExecutors
		test10();
		
		test11();
		
		//Streams
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
		
		Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
		
		Arrays.asList(1,2,3,4,5,6).stream().forEach(s -> System.out.print(s + " "));
		Arrays.asList(1,2,3,4,5,6).parallelStream().forEach(s -> System.out.print(s + " "));
		Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s -> System.out.print(s + " "));
		//Parallel stream can improve the execution time of a process for large list for e.g
		
		//A task is a single unit of work performed by a thread 
		//Runnable is a Functional Interface
		
		//fire-and-forget => as once, it is submitted, the results are not directly available to the calling thread
		//Submitting tasks are recommended over the Executing tasks => the submit() method has the obvious
		// advantage of doing the exact same thing execute() does, but with a return object that can be used to track the result
		//Submitting tasks => i should know for the exam, the methods invokeAll() and invokeAny()
		//The difference is the invokeAll() method will wait indefinitely until all tasks are complete while the 
		// invokeAny() method will wait indefinitely until at least one task completes
		//The Callable interface supports checked exceptions whereas the Runnable interface does not without an embedded try/catch block
		
		//newSingleThreadExecutor()
		//newSingleThreadScheduledExecutor()
		//newCachedThreadPool() -> create a thread pool of unbounded size.Commonly used for pools that require executing many short-lived asynchronous tasks
		//newFixedThreadPool(int nbThreads) -> when the number of tasks is less than the number of threads, the tasks are executed concurrently
		//newScheduledThreadPool(int nbThreads)
		
		
		//FORK/JOIN framework
		//Base case : a non-recursive method that is used to terminate the recursive path
		//Recursive case : a recursive method that may call itself one or multiple times to solve a problem
		//Applying the fork/join framework requires us to perform 3 steps:
		//1.Create a ForkJoinTask
		//2.Create the ForkJoinPool
		//3.Start the ForkJoinTask
		
		//LIVENESS
		//For the exam, must be familiar with 3 kinds of liveness => deadlock, starvation and livelock

	}

}

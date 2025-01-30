package com.core.ch07.concurrency.classes;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Concurrency {


	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
				
		
		//In most situation, you should implement the Runnable interface rather than extend the Thread class
		//Often you need a Thread to poll for a result to finish
		//Polling is the process of intermittently checking data at some fixed interval
		
		class Poll {
			public int counter = 0;
			public Poll() {
				new Thread(()->{
					for(int i = 0; i<500; i++)
						counter++;
				}).start();
				while(counter<100) {
					System.out.println("Not reached yet.");
				}
				System.out.println("Reached!");
			}
		}
		
		new Poll();
		
		//newSingleThreadExecutor()
		//newSingleThreadScheduledExecutor()
		//newCachedThreadPool() => create a thread pool of unbounded size. Commonly used for pools that require executing many short-lived asynchronous tasks
		//newFixedThreadPool(int nbThreads) => when the number of tasks is less than the number of threads, the tasks are executed concurrently
		//newScheduledThreadPool(int nbThreads)
		
		//Creating Threads with ExecutorService
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin");
			service.execute(()-> System.out.println("Print"));
			service.execute(()-> {
				for(int i = 0; i < 3; i++) {
					System.out.println("Printing record: " + i);
				}
			});
			service.execute(()-> System.out.println("Print"));
			System.out.println("End");
		} finally {
			if(null != service) service.shutdown();
		}
		
		//Submitting tasks are recommended over the executing tasks => the submit() method has the obvious advantage 
		//of doing the exact same thing execute() does, but with a return object that can be used to track the result
		//Submitting tasks => i should know for the exam, the methods invokeAll() and invokeAny()
		//The difference is the invokeAll() method will wait indefinitely until all tasks are complete while the
		//invokeAny() method will wait indefinitely until at least one task completes
		//The Callable interface supports checked exceptions whereas the Runnable interface does not without an embedded try/catch block
		
		ExecutorService service2 = null;
		try {	
			service2 = Executors.newSingleThreadExecutor();
			Future<?> result = service2.submit(()-> {
				int counter2 = 0;
				for(int i = 0; i < 9000; i++)
					counter2++;
			});
			result.get(1, TimeUnit.MILLISECONDS);
			System.out.println("Reached!");
		} finally {
			if (null != service2) service.shutdown();
		}
		
		//Callable vs Supplier => they both take no argument and return a generic type. One difference is that the method
		//in Callable can throw a checked Exception
		
		ScheduledExecutorService service3 = null;
		try {
			service3 = Executors.newSingleThreadScheduledExecutor();
			Runnable task1 = () -> System.out.println("Hello world!");
			Callable<String> task2 = () -> "Monkey";
			Future<?> result1 = service3.schedule(task1, 10, TimeUnit.SECONDS);
			Future<?> result2 = service3.schedule(task2, 10, TimeUnit.SECONDS);
			result1.get();
			result2.get();
		} finally {
			if (null != service3) service.shutdown();
		}

	}
}

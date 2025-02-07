package ch05_concurrency.classes;

public class PrintData implements Runnable {

	
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Printing record : " + i);
		}
	}
	
	public static void main(String[] args) {
		//The next lines are executed in an unknown order
		System.out.println("Begin");
		(new Thread(new ReadInventoryThread())).start();
		(new Thread(new PrintData())).start();
		(new Thread(new ReadInventoryThread())).start();
		System.out.println("End");
		
		//The next lines are executed always the same order
		(new Thread(new ReadInventoryThread())).run();
		(new Thread(new PrintData())).run();
		(new Thread(new ReadInventoryThread())).run();
		
		//In most situations, u should implement the Runnable interface rather than extend the Thread class
		//Often, you need a thread to poll for a result to finish
		//Polling is the process of intermittently checking data at some fixed interval
		
	}
}

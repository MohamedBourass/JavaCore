package com.mbo.ch07.concurrency.classes;

public class CheckResults {

	private static int counter = 0;
	
	public static void main(String [] args) throws InterruptedException {
		new Thread(() -> {
			for(int i = 0; i < 5000000; i++) {
				counter++;
			}
		}).start();
		
		while(CheckResults.counter < 1_000_000) {
			System.out.println("Not reached yet : " + CheckResults.counter);
		}
		System.out.println("Reached!");
		Thread.sleep(1000);
		System.out.println("CheckResults.counter : " + CheckResults.counter);
		
	}
}

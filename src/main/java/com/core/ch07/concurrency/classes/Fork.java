package com.core.ch07.concurrency.classes;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fork extends RecursiveTask<Double> {
	
	private static int MAX_VALUES = 10_000;
	private final int start;
	private final int stop;

	public static void main(String[] args) {
		//Computation { sum from x=0 to x=n => cos(x)+sin(x) }
//		double result = 0.0;
//		int n = 0;
//		for(int i = 0; i < n + 1; i++) {
//			result += Math.cos(i) + Math.sin(i);
//		}
		long begin = System.currentTimeMillis();
		System.out.println(calculate(100_000_000));
		long end = System.currentTimeMillis();
		System.out.println((end - begin)/1_000_000);
	}
	
	private Fork(int start, int stop) {
		this.start = start;
		this.stop = stop;
	}
	
	private static double calculate(int start, int stop) {
		double result = 0.0;
		int n = 0;
		for(int i = 0; i < n + 1; i++) {
			result += Math.cos(i) + Math.sin(i);
		}
		return result;
	}

	private static double calculate(int max) {
		ForkJoinPool pool = new ForkJoinPool();
		return pool.invoke(new Fork(0, max));
	}

	@Override
	protected Double compute() {
		final int count = this.stop - this.start;
		if(count < MAX_VALUES) {
			return calculate(this.start, this.stop);
		}
		final int middle = count/2;
		Fork task1 = new Fork(this.start, this.start+middle);
		task1.fork();
		
		Fork task2 = new Fork(this.start+middle, this.stop);
		double value2 = task2.compute();
		
		double value1 = task1.join();
		
		return value1 + value2;
	}
}

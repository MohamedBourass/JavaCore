package com.mbo.ch07.concurrency.classes;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecutor {

	public static void test1() {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = () -> System.out.println(LocalDateTime.now() + " : Hello Zoo");
		Callable<String> task2 = () -> "Monkey";
		
		Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		Future<?> result2 = service.schedule(task2, 1, TimeUnit.MINUTES);
	}
	
	public static void test2() {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println(LocalDateTime.now() + " : Hello Zoo");
		Future<?> result1 = service.scheduleWithFixedDelay(task1, 0, 5, TimeUnit.SECONDS);
	}
	
	
	public static void main(String[] args) {
		//test1();
		
		test2();
	}

}

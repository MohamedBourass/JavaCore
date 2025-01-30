package com.core.ch07.concurrency.classes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults2 {
	
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(()->{
				for(long i = 0; i < 9000; i++)
					CheckResults2.counter++;
			});
			result.get(1, TimeUnit.MILLISECONDS);
			System.out.println("Reached! " + result);
		} catch(TimeoutException e) {
			System.out.println("Not reached in time");
		} finally {
			if(null != service)
				service.shutdown();
		}
	}

}

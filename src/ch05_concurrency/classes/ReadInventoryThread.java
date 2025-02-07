package ch05_concurrency.classes;

public class ReadInventoryThread implements Runnable {

	public void run() {
		System.out.println("Printing zoo inventory");
	}
}

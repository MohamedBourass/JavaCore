package com.mbo.miscellaneous;

public class Fibonacci {
	// F(0) = 0
	// F(1) = 1
	// F(2) = 1
	// F(3) = 2
	// F(4) = 3
	// F(5) = 5
	// on and on..
	
	public static long computeIterative(int nb) {
		
		if(nb == 0 || nb == 1 ) {
			return nb;
		}
		long result1 = 0;
		long result2 = 1;
		long result = 0;
		
		int i = 2;
		while(i <= nb) {
			result = result1 + result2;
			result1 = result2;
			result2 = result;
			i++;
		}
		return result;
	}
	
	public static long computeRecursive(int nb) {
		if(nb == 0 || nb == 1 ) {
			return nb;
		}
		long result = 0;
		int i = 2;
		while(i <= nb) {
			result = computeRecursive(i-1) + computeRecursive(i-2);
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("F(0) - computeIterative : " + computeIterative(0));
		System.out.println("F(0) - computeRecursive : " + computeRecursive(0));
		
		System.out.println("F(1) - computeIterative : " + computeIterative(1));
		System.out.println("F(1) - computeRecursive : " + computeRecursive(1));
		
		
		System.out.println("F(14) - computeIterative : " + computeIterative(14));
		System.out.println("F(14) - computeRecursive : " + computeRecursive(14));
		
		System.out.println("F(25) - computeIterative : " + computeIterative(25));
		System.out.println("F(25) - computeRecursive : " + computeRecursive(25)); 
	}
}

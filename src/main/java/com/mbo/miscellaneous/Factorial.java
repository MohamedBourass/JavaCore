package com.mbo.miscellaneous;

public class Factorial {

	public static long computeRecursive(int n) {
		//long result = 1;
		return (n>1) ? n *= computeRecursive(n-1) : 1;
	}
	
	public static long computeIterative(int n) {
		long result = 1;
		while(n > 1) {
			result *= n;
			n--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int nb = 4;
		System.out.println("Recursive 4! => " + computeRecursive(nb));
		System.out.println("Iterative 4! => " + computeIterative(nb));
	}
}

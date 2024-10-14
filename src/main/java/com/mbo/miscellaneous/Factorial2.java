package com.mbo.miscellaneous;

import java.math.BigInteger;


public class Factorial2 {

	// n = n * (n-1) * … * 3 * 2 * 1;
	// 0! = 1
	// 1! = 1
	// 2! = 2 * 1
	// 3! = 3 * 2 * 1
	// on and on..

	//With long, the limit is quickly reached...
	public static long iterativeCompute(int n) {
		
		if (n > 1) {
			long result = 1;
			while(n > 1) {
				result *= n;
				n--;
			}
			return result;
		} else if(n > -1) {
			return 1;
		} else {
			return -1;
		}
	}

	//When long is not sufficient, switch to BigInteger to do computation
	public static BigInteger recursiveCompute(int n) {
		if (n > 1) {
			return BigInteger.valueOf(n).multiply(recursiveCompute(n-1));
		} else if(n > -1) {
			return BigInteger.valueOf(1);
		} else {
			return BigInteger.valueOf(-1);
		}
	}

	public static void main(String[] args) {
	
		System.out.println(iterativeCompute(100));

		
		System.out.println(recursiveCompute(100));
	
	}


}
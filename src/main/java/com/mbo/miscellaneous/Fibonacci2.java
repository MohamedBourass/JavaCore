package com.mbo.miscellaneous;


public class Fibonacci2 {

	// F(1) = 1
	// F(2) = 1
	// F(3) = 2
	// F(4) = 3
	// F(5) = 5
	// on and on..

	public static long iterativeCompute(int n) {
		
		if( n > 2 ) {
			long ancestor1 = 1;
			long ancestor2 = 1;
			long result = 0;
			for(int i = 3; i < n+1; i++) {
				result = ancestor1 + ancestor2;
				ancestor1  = ancestor2;
				ancestor2 = result;
			}
			return result;
		} else {
			return 1;
		}
	}

	public static long recursiveCompute(int n) {
		if(n > 2) {
			return recursiveCompute(n-1) + recursiveCompute(n-2);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
	
		System.out.println(iterativeCompute(5));

		
		System.out.println(recursiveCompute(5));
	
	}


}
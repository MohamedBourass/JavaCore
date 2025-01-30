package com.core.ch01.basics.classes;

public class Outer {

	private String greeting = "Hi";
	
	public class Inner {
		public int repeat = 3;
		
		public void go() {
			for(int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}
	
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
}

package com.mbo.ch02.patterns.classes;

public class Singleton2 {

	//private constructor
	private Singleton2() {}
	
	//private static variable instance
	private static Singleton2 instance;
	
	//double synchronization
	public static Singleton2 getInstance() {
		if (null == instance) {
			synchronized(Singleton2.class) {
				if (null == instance) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}

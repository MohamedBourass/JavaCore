package com.core.ch02.patterns.behavioral;

public class Singleton {
	
	//private static final instanciation
	private  final static Singleton instance = new Singleton();
	
	//Private constructor
	private Singleton() {
	}
	
	//public static getInstance
	public static Singleton getInstance() {
		return instance;
	}
}

package com.core.ch01_classesobjects.classes;

abstract public class Cat {

	String name = "The Cat";
	
	public Cat() {
		System.out.println("Miaou..");
	}
	
	void clean() {
		System.out.println("I'm the cat");
	}
}

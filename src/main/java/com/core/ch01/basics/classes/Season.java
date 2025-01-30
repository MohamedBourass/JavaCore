package com.core.ch01.basics.classes;

public enum Season {

	WINTER("Low"), 
	SPRING("Medium"), 
	SUMMER("High"), 
	FALL("Medium");
	
	private String expectedVisitors;
	
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public String toString() {
		return expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
}
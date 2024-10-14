package com.mbo.miscellaneous;

public class Test {

	public static void main(String[] args) {
		//For a given class, it is a good practice to override the method toString()
		//String is an immutable class
		//Object methods=> getClass(), hasCode(), equals(), toString()
		//The contract for the equals() method => reflexive, symmetric, transitive, consistent, and for non-null value, x.equals(null) should return false
		//Whenever you override equals(), you are also expected to override hashCode(). The hashCode() is used when you storing
		//the object as a key in a map
		System.out.println("Hello world!");
		
		//What is the difference between final and effectively final ?
		//What is a checked exception ?
	}
}

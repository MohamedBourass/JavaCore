package com.mbo.ch01.basics.classes;

@FunctionalInterface
public interface Sprint {

	public void sprint(Animal animal);
	
	public static void sprint2()  {
	};
	
	public default boolean isAlive() {
		return true;
	}
}

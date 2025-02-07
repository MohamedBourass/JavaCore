package com.core.ch01_classesobjects.classes;

@FunctionalInterface
public interface Sprint {

	public void sprint(Animal animal);
	
	public static void sprint2()  {
	};
	
	public default boolean isAlive() {
		return true;
	}
}

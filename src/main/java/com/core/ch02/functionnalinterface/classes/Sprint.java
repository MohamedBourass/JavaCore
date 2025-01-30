package com.core.ch02.functionnalinterface.classes;

@FunctionalInterface
public interface Sprint {

	public void sprint(Animal animal);
	
	public default  String getName() {
		return "Animal";
	}
}

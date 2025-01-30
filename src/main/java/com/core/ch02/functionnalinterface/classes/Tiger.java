package com.core.ch02.functionnalinterface.classes;

public class Tiger extends Animal implements Sprint {

	public Tiger(String speciesName, boolean hopper, boolean swimmer) {
		super(speciesName, hopper, swimmer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast ! " + animal.toString());
	}
	


}

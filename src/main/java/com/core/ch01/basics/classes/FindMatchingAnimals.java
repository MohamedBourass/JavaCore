package com.core.ch01.basics.classes;

import java.util.function.Predicate;

public class FindMatchingAnimals {
	
	private static void print(Animal animal, Predicate<Animal> trait) {
		System.out.println(animal);
	}

	public static void main(String[] args) {

		print(new Animal(), a -> a.canHop());
	}

}

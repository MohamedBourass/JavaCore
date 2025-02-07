package ch03_functionalinterfaces;

import ch03_functionalinterfaces.classes.Animal;
import ch03_functionalinterfaces.classes.CheckTrait;
import ch03_functionalinterfaces.classes.Tiger;

public class Main {
	
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		} else 
			System.out.println("N/A");
	}

	public static void main(String[] args) {
		Tiger t = new Tiger("Tiger", true, true);
		t.sprint(t);
		print(new Animal("fish", false, true), a->a.canHop());
		print(new Animal("fish", false, true), a->a.canSwim());
		print(new Animal("kangaroo", true, false), a->a.canHop());
		print(new Animal("kangaroo", true, false), a->a.canSwim());
	}
}

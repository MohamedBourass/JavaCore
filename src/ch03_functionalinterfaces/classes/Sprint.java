package ch03_functionalinterfaces.classes;

@FunctionalInterface
public interface Sprint {

	void sprint(Animal animal);
	
	default  String getName() {
		return "Animal";
	}
}

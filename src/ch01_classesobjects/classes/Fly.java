package ch01_classesobjects.classes;

public interface Fly {

	public static final int MAX_SPEED = 100;
	
	//public boolean isflying();
	
	public boolean test(Animal animal);
	
	public default boolean isQuadruped() {
		return true;
	}
	
	public static double calculateSpeed(float distance, double time) {
		return distance / time;
	}
}

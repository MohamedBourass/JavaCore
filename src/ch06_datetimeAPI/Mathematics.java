package ch06_datetimeAPI;

import java.util.Arrays;

public class Mathematics {
	
	
	public static long maximify(int[] tab) {
		int max = tab[0];
		for(int e : tab) {
			max  = (e > max) ? e : max;
		}
		return max;
	}
	
	public static int randomify(int nb) {
		return (int) ((Math.random())*10%nb);
	}
	
	public static int[] randomTab(int[] tab, int nb) {
		int[] arr = new int[nb];
		for(int i = 0; i < nb; i++) {
			arr[i] = tab[randomify(tab.length-1)];
		}
		return arr;
	}
	
	public static void main(String[] args) {	
		int[] tab = {1, 4, 10, 5, 3, 9, 2, 11, 12};
		//Find the max value in the tab ?

		//Use the stream
		System.out.println("min : " + Arrays.stream(tab).min().getAsInt());
		System.out.println("max : " + Arrays.stream(tab).max().getAsInt());
		
		//Use the sort method
		Arrays.sort(tab);
		System.out.println("min : " + tab[0]);
		System.out.println("max : " + tab[tab.length-1]);
		
		//Use a specified method
		System.out.println("Maximify : " + maximify(tab));
		
		//Random
		System.out.println("Round : " + Math.random()); //Return a random value between 0 and 1
		System.out.println("Math.floor : " + Math.floor(2.7)); //2.0
		System.out.println("Math.ceil : " + Math.ceil(2.7)); //3.0
		
		//Random between 0 and n
		System.out.println("Random : " + randomify(5));
		
		//Return 5 random value from the tab
		int[] tab2 = randomTab(tab, 5);
		for (int i : tab2) {
			System.out.println("Random 5 values : " + i);
		}
	}
}
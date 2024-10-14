package com.mbo.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Divers {

	public static int maximify(int[] tab) {
		int max = tab[0];
		for(int i : tab)
			max = (i > max) ? i : max;
		return max;
	}
	
	public static int random(int n) {
		//System.out.println((int) Math.round(Math.random()));
		return (int) (Math.round(Math.random()*10)%n);
	}
	
	public static int[] random10values(int[] tab) {
		int[] result = new int[10];
		//System.out.println(tab.length);
		//Create a random value between 0 and the length-1
		int i = 0;
		while(i<10) {
			//System.out.println(result[random(tab.length)]);
			result[i] = tab[random(tab.length)];
			i++;
		}
		return result;
	}
	
	static class Rabbit {
		int id;
		public String toString() {
			return String.valueOf(id);
		}
	}
	
	public static void main(String[] args) {
		
		int[] tab = { 1, 4, 10, 3, 5, 7 };
		//Find the max?
		System.out.println(maximify(tab));
		//Create a function who will return 10 randoms values belonging to tab ?
		//First step, create a random function
		System.out.println(Math.random()); //Return a double value between 0 and 1
		//Return a random integer between 0 and the size-1 of the tab?
		System.out.println("*****RANDOM10VALUES*****");
		int[] randomtab = random10values(tab);
		for(int value : randomtab)
			System.out.println(value);
		System.out.println("*****SORT*****");
		Integer[] tab2 = { 1, 4, 10, 3, 5, 7 };
		//List<int[]> arr = Arrays.asList(tab); 
		Arrays.sort(tab2, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		});
		for(int i : tab2)
			System.out.println(i);
		
		System.out.println("*****RABBIT*****");
		
		ArrayList<Rabbit> list = new ArrayList<>();
		Rabbit rab1 = new Rabbit();
		rab1.id = 10;
		Rabbit rab2 = new Rabbit();
		rab2.id = 5;
		list.add(rab1);
		list.add(rab2);
		for(Rabbit r : list)
			System.out.println(r);
		
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		Collections.sort(list,c);
		for(Rabbit r : list)
			System.out.println(r);
		System.out.println("*****COMPARATOR*****");
		List<String> al = new ArrayList<>();
		al.add("Homme");
		al.add("Hippopotame");
		al.add("Elephant");
		al.add("Tic");
		for(String s : al)
			System.out.println(s);
		Collections.sort(al);
		for(String s : al)
			System.out.println(s);
		//Comparator<String> comp = (s1, s2) -> s2.length() - s1.length();
		Collections.sort(al, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
				//return 1 if s2 should be before s1 
			}
		});
		for(String s : al)
			System.out.println(s);
		
		
		int z = 7;
		System.out.println(z/2);
		System.out.println(Math.floor(2.7));
		System.out.println(Math.ceil(2.6));
		
		Integer y = new Integer(3);
		//Object
		//Integer x =
		
		
	}
	
	
	
}

package com.mbo.ch03.collections.classes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class GenericsAndCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		list.add("Fluffy");
		list.add("Webby");
		
		String[] array = new String[list.size()]; 
		array[0] = list.get(1);
		array[1] = list.get(0);
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + "-");
		
		String[] array2 = { "toto", "tata"};
		List<String> list2 = Arrays.asList(array2);
		System.out.println(list2);
		String[] array3 = (String[]) list2.toArray();
		for(String s : array3)
			System.out.println(s);
		
		int[] numbers = {6,9,1,8};
		Arrays.sort(numbers);
		///System.out.println(numbers);
		for(int i : numbers)
			System.out.println(i);
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		List<Integer> list3 = Arrays.asList(9, 7, 5, 3);
		Collections.sort(list3);
		System.out.println(list3);
		System.out.println(Collections.binarySearch(list3, 3));
		System.out.println(Collections.binarySearch(list3, 2));
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(1);
		numbers2.add(new Integer(3));
		numbers2.add(new Integer(5));
		System.out.println(numbers2);
		numbers2.remove(1);
		System.out.println(numbers2);
		numbers2.remove(new Integer(5));
		System.out.println(numbers2);
		
		int ij = 15_000;
		System.out.println(ij);
		
		//legacy code = old code
		
		Object[] objects = {new Integer(2)};
		objects[0] = "toto";
		List<? extends Number> listNb = new ArrayList<Integer>();
		
		// Collections methods =>add, remove, isEmpty, size, clear, contains
		// Set, List and Queue implement collections interface
		// Map is separate thing
		
		// LinkedList implements both List and Queue
		// Vector do the same thing as ArrayList except more slowly
		// List methods => add, get, indexOf, lastIndexOf, remove, set
		
		// HashSet stores its element in a hash table
		// TreeSet implements the Navigable interface
		
		// Queue interface
		// A queue is assumed to be FIFO, the other common format is LIFO
		// LinkedList  can be insert or remove elements from both the front and back
		// ArrayDeque is more efficient than a LinkedList
		// ArrayDeque methods => add, element, offer, remove, push, poll, peek, pop
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		System.out.println(queue.offer(10));
		System.out.println(queue.offer(4));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		// A hashtable is like vector in that it is really old and thread-safe and you won't be expected to use it
		// Map methods => clear, isEmpty, size, get, put, remove, containsKey, containsValue, keySet, values
		
		// Do not be confused between Comparator and Comparable
		
	}
}

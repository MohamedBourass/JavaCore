package com.core.ch03.collections.classes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections2 {

	public static void main(String[] args) {
		
		/*List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");
		
		String[] array = new String[list.size()];
		array[0] = list.get(0);
		array[1] = list.get(1);
		
		for(int i = 0; i < array.length; i++)
			System.out.println(i + " : " + array[i]);
		
		String[] array2 = {"toto", "titi"};
		for(String s : array2)
			System.out.println(s);
		
		Map<Integer,String> hm = new HashMap<>();
		hm.put(10, "Google");
		hm.put(5, "Facebook");
		hm.put(20, "Microsoft");
		hm.put(30, "Amazon");
		
		for(Integer i : hm.keySet()) {
			System.out.println(i + " : " + hm.get(i));
		}
		*/
		
		System.out.println("/****** ARRAY and ARRAY LIST ******/");
		//A list is an ordered collections of elements that allows duplicate entries. Elements in a list
		//can be accessed by an int index
		//A ArrayList is like a resizable array. When elements are added, the ArrayList automatically grows.
		//The main benefit of an ArrayList is that, you can lookup any elements in a constant time.
		//A LinkedList is special because it implements both List and Queue
		//An array is not resizable (?->to verifiy==>faux!!)
		//An array is not modifiable
		String[] tab = { "M", "N", "O"};
		for(String s : tab) {
			System.out.println(s);
		}
		System.out.println("First element: " + tab[0]);
		System.out.println("Size: " + tab.length);
		//Convert an array to list
		List<String> arr = Arrays.asList(tab);
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("First element: " + arr.get(0));
		System.out.println("Size: " + arr.size());
		
		List<String> arr2 = new ArrayList<>();
		Collections.addAll(arr2, tab);
		for(String s : arr2) {
			System.out.println(s);
		}
		System.out.println("First element: " + arr2.get(0));
		System.out.println("Size: " + arr2.size());

		List<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		for(String s : al) {
			System.out.println(s);
		} 
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("First element: " + al.get(0));
		System.out.println("Size: " + al.size());
		
		//Collections
		//A collection is a group of objects contained in a single object.
		//Common collections methods =>  add(E e), remove(), isEmpty(), size(), clear(), contains(Object e)
		//Vector do the same thing as ArrayList except more slowly
		//A hashtable is like vector in that it is really old and thread-safe and you won't be expected to use it
		
		System.out.println("/****** SET ******/");
		//A set is a collection that does not allow duplicate entries
		//A HashSet stores its elements in a hashtable. This means that it uses the hashCode() method of the objects to retrieve
		//them more efficiently
		//A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order.
		//The tradeoff is that adding and checking if an element is present are both O(log n)
		//TreeSet implements a special interface called NavigableSet
		Set<String> hs = new HashSet<String>();
		hs.add("X");
		hs.add("Y");
		hs.add("Z");
		for(String s : hs) {
			System.out.println(s);
		}
		
		Iterator<String> it2 = hs.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("First element: " + hs.toArray()[0]);
		System.out.println("Size: " + hs.size());
		
		System.out.println("/****** QUEUE ******/");
		//A queue is a collection that orders its elements in a specific order for processing.
		//A typical queue process its elements in a first-in,first-out order, but other orderings are possible.
		//A queue is assumed to be FIFO, the other common format is LIFO
		//A LinkedList implements Queue: in addition to being a list, it is a double-ended queue. It means that
		//you can insert and remove elements from both the front and back of the queue. It is not as efficient than a "pure" queue
		//An ArrayQueue is a "pure" double-ended queue. It was introduced in Java6 ad it stores its elements in a resizable array
		//ArrayDeque methods to know for the exam => 
		
		//element() => returns next elt or throws an exception if empty queue
		//poll() => removes and returns next elt or returns null if empty queue
		//peek() => returns next elt or returns null if empty queue
		//remove() => removes and return elt or throws an exception if empty queue
		
		//add(E e) => adds an elt to the back of the queue and returns true or throws an exception
		//offer(E e) => adds an elt to the back of the queue
		//push(E e) => adds an elt to the front of the queue
		
		//Push method is what makes it a double-ended queue
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.offer(10);
		stack.offer(5);
		stack.push(2);
		System.out.println(stack);
		stack.add(4);
		System.out.println(stack);
		System.out.println(stack.element());
		System.out.println(stack.element());
		System.out.println(stack.poll());
		System.out.println(stack);

		System.out.println("/****** MAP ******/");
		//A map is a collection that maps keys and values with no duplicate keys allowed.
		//The elements in a map are key/value pairs
		//Map methods => clear(), isEmpty(), size(), get(Object key), put(K key, V value), 
		// remove(Object key), containsKey(Object key), containsValue(Object), keySet(), values()
		Map<Integer,String> hm = new LinkedHashMap<>();
		hm.put(10,"D");
		hm.put(20,"E");
		hm.put(30,"F");	
		for(Integer i : hm.keySet()) {
			System.out.println(i + " : " + hm.get(i));
		}

		System.out.println("FOR EACH");
		hm.entrySet().forEach(s->System.out.println(s));
		hm.forEach((k,v)->System.out.println(k + " " + v));

		Set<Integer> ks = hm.keySet();
		Iterator<Integer> it3 = ks.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("First element: " + hm.values().toArray()[0]);
		System.out.println("Size: " + hm.size());
		
		//Comparator vs Comparable
		//The Comparable interface has only one method:
		//public interface Comparable<T> {
		//	public int compareTo(T o);
		//}
		//Comparator<Duck> byWeight = new Comparator<Duck>(){
		//public int compare(Duck d1, Duck d2) {
		// return d1.getWeight()-d2.getWeight();
		//}
		//};
		
	
		//Searching and Sorting
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(13);
		hs2.add(4);
		hs2.add(7);
		System.out.println("HashSet : " + hs2);
		
		int[] numbers = {6,9,1,8};
		System.out.println("Numbers: " + numbers.toString());
		for(int i : numbers) {
			System.out.println(i+" ");
		}
		Arrays.sort(numbers);
		System.out.println("Sorted numbers: " + numbers);
		for(int i : numbers) {
			System.out.println(i + " ");
		}
		System.out.println(Arrays.binarySearch(numbers, 6));
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		//Java 8 lambdas
		List<String> test1 = new ArrayList<>();
		test1.add("Edd");
		test1.add("Mohamed");
		test1.add("Manuel");
		System.out.println(test1);
		test1.removeIf(p->p.startsWith("Ma"));
		System.out.println(test1);
		test1.forEach(p->System.out.println(p));
		
		List<Integer> test2 = Arrays.asList(1,2,3);
		System.out.println(test2);
		test2.replaceAll(p->(int)Math.pow(p,2));
		System.out.println(test2);
	}
}

package ch02_genericscollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections3 {

	//I will say here all what I know about array, collection and set
	
	
	public static void main(String[] args) {
//		//Modifiable array
//		Integer[] tab = new Integer[10];
//		tab[5] = 10;
//		tab[5] = 11;
//		for(Integer i : tab) {
//			System.out.println(i);
//		}
//		List<Integer> arr = Arrays.asList(tab);
//		arr.set(0, 1);
//		for(Integer i : arr) {
//			System.out.println(i);
//		}
//		System.out.println("Length: " + tab.length);
//		System.out.println("Size: " + arr.size());
//		
//		System.out.println(arr.contains(new Integer(11)));
//		System.out.println("Is empty: " + arr.isEmpty());
//		System.out.println("Get: " + arr.get(6));
//		System.out.println("Length: " + tab.length);
//		System.out.println("Size: " + arr.size());
//		//Not modifiable array
//		int[] tab2 = { 5, 7, 8, 10, 1, 3};
//		tab2[2] = 3;
//		for(int i : tab2) {
//			System.out.println(i);
//		}
//		System.out.println("Length: " + tab2.length);
		
		//Difference between ArrayList and LinkedList ?
		//Search is faster in ArrayList O(1) instead of O(n) in LinkedList
		//Add and remove methods are faster in LinkedList O(1) than ArrayList 
		//Vector is thread-safe while the ArrayList is not thread-safe
		System.out.println("**** ArrayList ****");
		List<String> al = new ArrayList<>();
		al.add("C");
		al.add("A");
		al.add("C");
		al.add("B");
		System.out.println(al);
		for(String s : al)
			System.out.println(s);
		System.out.println(al.get(0));
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "B"));
		
		System.out.println("**** LinkedList ****");
		List<String> ll = new LinkedList<>();
		ll.add("C");
		ll.add("A");
		ll.add("C");
		ll.add("B");
		for(String s : ll)
			System.out.println(s);
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println("TreeSet");
		Set<String> ts = new TreeSet<>();
		ts.add("A");
		ts.add("C");
		ts.add("B");
		for(String s : ts)
			System.out.println(s);
		//Comment rendre une collection immutable?
		System.out.println("Check unmodifiable");
		System.out.println(al);
		Collection<String> cls = Collections.unmodifiableList(al);
		//cls.add("T"); //==> Generate error!!!
		System.out.println(al);
		
		System.out.println("Iterator array list");
		Iterator<String> ia = al.iterator();
		while(ia.hasNext())
			System.out.println(ia.next());
		
		System.out.println("Iterator treeset");
		Iterator<String> its = ts.iterator();
		while(its.hasNext())
			System.out.println(its.next());
	
		System.out.println("***** HASHMAP *****");
		Map<Integer, String> hm = new HashMap<>();
		hm.put(10, "Google");
		hm.put(2, "Facebook");
		hm.put(30, "Oracle");
		hm.put(20, "Microsoft");
		System.out.println(hm);
		
		//while(hm.entrySet().iterator().hasNext())
		//	System.out.println(hm.en)
		
		for(Integer i : hm.keySet())
			System.out.println(hm.get(i));
		
		System.out.println("***** QUEUE *****");
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.offer(10);
		stack.offer(5);
		stack.push(2);
		System.out.println(stack);
		stack.add(4);
		System.out.println(stack);
		System.out.println(stack.element());
		System.out.println(stack);
		System.out.println(stack.element());
		System.out.println(stack.poll());
		System.out.println(stack);
		System.out.println("***** ARRAYS *****");
		
		int[] tab = new int[3];
		Integer[] tab2 = new Integer[3];
		
	}
	
	

}

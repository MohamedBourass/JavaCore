package com.core.ch03.collections.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class _Collection {
	
	public static int maxify(int[] arr) {
		int size = arr.length;
		int max = 0;
		if(0 == size) {
			max = -1;
			//throw new Exception();
		} else {
			max = arr[0];
			for(int i : arr) {
				max = (i > max) ? i : max;
			}
		}
		return max;
	}

	
	public static int random_1_5() {
		long l = System.currentTimeMillis();
		System.out.println(l);
		String s = Long.valueOf(l).toString();
		int random0_10 = Integer.valueOf(s.substring(s.length()-1));
		
		return 1 + random0_10%5;
	}

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0; i<10; i++) {
			System.out.println(random_1_5());
			Thread.sleep(200);
			//Random.
		}
		
		
		System.out.println("Hello world!");
		
		/******** SET ********/
		
		Set<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		/******** MAP ********/
		
		Map<Integer, String> hm = new LinkedHashMap<>();
		hm.put(1, "D");
		hm.put(10, "E");
		hm.put(2, "F");
		
		Set<Entry<Integer, String>> es = hm.entrySet();
		Iterator<Entry<Integer, String>> it2 = es.iterator();
		
		while(it2.hasNext())
			System.out.println(it2.next()); //Particular!!
		
		Set<Integer> ks = hm.keySet();
		
		Iterator<Integer> it3 = ks.iterator();
		while(it3.hasNext()) {
			System.out.println(hm.get(it3.next()));
		}


		System.out.println("Loop hashmap =>");
		for(Integer i : hm.keySet()) {
			System.out.println(i + " : " + hm.get(i));
		}
		
		/******** LIST ********/
		
		List<String> al = new ArrayList<>();
		al.add("G");
		al.add("H");
		al.add("I");
		
		Iterator<String> it4 = al.iterator();
		
		while(it4.hasNext())
			System.out.println(it4.next());
		
		for(String s : al) {
			System.out.println(s);
		}
		
		/******** ARRAY TO LIST ********/
		
		String[] tab = { "M", "N", "O" };
		
		List<String> arr = new ArrayList<>();
		//arr = Arrays.asList(tab);
		Collections.addAll(arr, tab);
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		Queue<String> abq = new ArrayBlockingQueue<>(2);
		abq.add("X");
		abq.add("Y");
		//abq.add("Z");
		
		for(String s : abq) {
			System.out.println(s);
		}
		
		int[] tabToMaximize = {1, 3, 7, 88, 2, 3, 10};
		System.out.println(maxify(tabToMaximize));
		//List<Integer> arr2 = List.

		/*List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);*/
		
		
	}
	
	
}

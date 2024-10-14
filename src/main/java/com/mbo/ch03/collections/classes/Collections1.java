package com.mbo.ch03.collections.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections1 {

	public static void main(String[] args) {
		
		String[] t1 = {"C", "B", "A"};
		for(String s: t1) {
			System.out.println(s);
		}
		
		System.out.println("tab length : " + t1.length);
		
		for(int i= 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
		
		List<String> l1 =  Arrays.asList(t1);
		Collections.sort(l1);
		for(String s : l1) {
			System.out.println(s);
		}
		
		System.out.println("list size : " + l1.size());
		
		List<String> l2 = new ArrayList<String>();
		Collections.addAll(l2, t1);
		Iterator<String> i2 = l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("First element : " + l2.get(0));
		
		
		Set<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		
		for(String s : hs) {
			System.out.println(s);
		}
		
		hs.forEach(p->System.out.println(p.toLowerCase()));
		
		int[] nb = {10, 5, 7, 2, 6, 1, 3};
		
		for(int i : nb) {
			System.out.println(i);
		}
		
		Arrays.sort(nb);
		for(int i : nb)
			System.out.println(i);
		
		
	}
}

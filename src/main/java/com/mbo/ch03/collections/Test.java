package com.mbo.ch03.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	
	final static Map<String, String> myMap = new HashMap<>();

	public static void main(String[] args) {
		
		//myMap = new HashMap<>(); // Cannot do this!
		myMap.put("Toto2", "Test1");
		//myMap.put(1, "Test2");
		myMap.put("Titi", "Test3");
		//myMap.put(null, "Test4");
		myMap.forEach((x,y)->System.out.println(y));
		
		
		System.out.println(myMap.get(null));
		System.out.println(myMap);
		System.out.println(myMap.size());
		
		List<String> list = new ArrayList<>();
		list.add("Mo1");
		list.add("Mo2");
		list.add("Mo1");
		//list.
		
		System.out.println(list);
		
		
		Map<String, String> myMap2 = new TreeMap<>();
		//myMap.put(1, value)
	}
}

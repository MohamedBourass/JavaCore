//All what I know here about collections
//Collections
package com.mbo.ch03.collections.classes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class Collections4 {

	public static void incremente(Integer i) {
		//Integer j = new Integer(++i);
		//return j;
		
		System.out.println(i);
	}
	
	public static void createObj(Object obj) {
		//obj = new ;
		System.out.println(obj);
	}
	
	public  void changeName(Dog a) {
		//a = new Dog();
		a.setName("Rififi");
	}
	
	public class Dog {
		private String name = "Max";
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
	
	

	public static void main(String[] args) {
		
		/*int[] tab = new int[3];
		tab[0] = 10;
		tab[1] = 2;
		tab[2] = 7;
		for(int i : tab)
			System.out.println(i);
		
		System.out.println(tab.length);
		int[] tab2 = Arrays.copyOf(tab, 10);
		System.out.println(tab2.length);
		for(int i : tab2)
			System.out.println(i);		

		
		List<Integer> li = Arrays.asList(1, 3, 7, 2, 10, 4);
		for(int i : li)
			System.out.println(i);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(10);
		al.add(-1);
		for(int i : al)
			System.out.println(i);
		
		int n = 100;
		while(n>50) {
			System.out.println(n);
			n--;
		}
		int j = 100;
		do {
			System.out.println(j);
			j--;
		} while(j>50);
		
		for(int i = 100, j1 = 51; i>50; i--, j1++) {
			System.out.println(i+"-"+j1);
		}
		int m = 0;
		//search:
		for(;;) {
			System.out.println(m);
			m++;
			if(m==100) {
				//break search;
				//break;
				break;
			} else {
				continue;
			}
		}
		
		int k = 0;
		//k++;
		System.out.println(k);
		
		Integer l = 1;
		//l++;
		incremente(l);
		System.out.println(l);
		//Dog b = new Dog();
		//Java always pass these arguments by value not by reference...
		Collections4 c4 = new Collections4();
		Collections4.Dog o = c4. new Dog();
		//createObj(o);
		//o.setName(name);
		c4.changeName(o);
		System.out.println(o.getName());
		
		Byte b = 8;
		Integer c = 8;
		if(b.equals(c)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} ///Why ?
		System.out.println(0.3f - (3f*0.1f));
		
		BigDecimal first = BigDecimal.valueOf(0.3);
		BigDecimal two = BigDecimal.valueOf(3);
		BigDecimal three = BigDecimal.valueOf(0.1);
	
		BigDecimal result = first.add(BigDecimal.valueOf(-1).multiply(two.multiply(three)));
		System.out.println(result);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);*/
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Momo");
		hm.put(1,"Dodo");
		
		Set<Entry<Integer, String>> es = hm.entrySet();
		Iterator<Entry<Integer, String>> it2 = es.iterator();
		
		while(it2.hasNext())
			System.out.println(it2.next()); //Particular!!
	}
	



}
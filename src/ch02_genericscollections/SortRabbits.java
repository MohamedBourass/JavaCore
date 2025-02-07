package ch02_genericscollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {


	public static void main(String[] args) {
		
		class Rabbit {
			int id;
			
			public String toString() {
				return String.valueOf(id);
			}
		}
		
		List<String> test1 = new ArrayList<>();
		test1.add(new String("Toto"));
		test1.add(new String("Tata"));
		Collections.sort(test1);
		System.out.println(test1);
		
		List<Rabbit> test2 = new ArrayList<>();
		Rabbit rab1 = new Rabbit();
		rab1.id = 3;
		Rabbit rab2 = new Rabbit();
		rab2.id = 5;
		
		test2.add(rab1);
		test2.add(rab2);
		//Collections.sort(test2); //Does not compile !!
		
		Comparator<Rabbit> c = (r1, r2) -> r2.id - r1.id;
		Collections.sort(test2, c );
		System.out.println(test2);
		
		List<Integer> list = Arrays.asList(1, 2, 3);
		list.replaceAll(s->s*2);
		System.out.println(list);
		//list.remove("4");
		//System.out.println(list);
		for (Integer c1 : list)
			System.out.println(c1);
		
		list.forEach(c1 -> System.out.println(c1));
		list.forEach(System.out::println);
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.removeIf(s -> s.equals("1"));
		System.out.println(list2);
		
		
		
	}

}

package com.mbo.ch04.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgramming {
	
	public static void main(String[] args) {
		
		//Normal use
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		//Suppliers
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = ()->LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		//Consumers
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Annie");
		c2.accept("Annie");
		
		//BiConsumer
		Map<String, Integer> map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k,v)->map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
		//Predicate
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x-> x.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		//BiPredicate
		BiPredicate<String, String> b3 = String::startsWith;
		BiPredicate<String, String> b4 = (string, prefix) -> string.startsWith(prefix);
		
		System.out.println(b3.test("chicken", "c"));
		System.out.println(b4.test("mohamed","moha"));
		
		//Function
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("toto"));
		System.out.println(f2.apply("mohamed"));
		
		//BiFunction
		BiFunction<String, String, String> b5 = String::concat;
		BiFunction<String, String, String> b6 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b5.apply("toto", "tata"));
		System.out.println(b6.apply("mohamed ", "bourass"));
		
		//UnaryOperator
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		
		System.out.println(u1.apply("toto"));
		System.out.println(u2.apply("mohamed"));
		
		//BinaryOperator
		BinaryOperator<String> b7 = String::concat;
		BinaryOperator<String> b8 = (x,y) -> x.concat(y);
		
		System.out.println(b7.apply("toto","tata"));
		System.out.println(b8.apply("mohamed","bobo"));
		
		//Optional
		System.out.println(Optional.empty());
		
		//Streams
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
		//randoms.forEach(System.out::println);
		System.out.println(fromList.count());
		
		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = s.min((ss1, ss2) -> ss1.length() - ss2.length());
		min.ifPresent(System.out::println);
		
		//reduce
		Stream<Integer> stream = Stream.of(3,5,6);
		System.out.println(stream.reduce(2,(a,b)->a*b));
		
		//collect
		Stream<String> ss = Stream.of("w", "o", "l", "f");
		StringBuilder word = ss.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word);
		
		//collect
		Stream<String> sss = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = sss.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);
		
		//filter
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo", "bonobo");
		s4.filter(x -> x.startsWith("m")).forEach(System.out::println);
		
		//distinct
		Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo", "bonobo");
		s5.distinct().forEach(System.out::println);
		
		//limit
		Stream<Integer> s6 = Stream.iterate(1, n -> n + 1);
		s6.skip(5).limit(5).forEach(System.out::println);
		
		Stream<Integer> a = Stream.iterate(1, n -> n+1);
		a.limit(5).forEach(System.out::println);
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result);
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
		Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2);

		//int[] array = new int[n];
		//Collection.
		
	}

}

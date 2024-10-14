package com.mbo.ch04.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		//Empty stream:
		Stream<String> empty = Stream.empty();
		//Stream with a single element:
		Stream<Integer> singleElement = Stream.of(1);
		//Create a stream from an array:
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		System.out.println("/****** stream count() ******/");
		System.out.println(fromArray.count());
		
		List<String> list = Arrays.asList("a", "b", "c");
		//Create a stream from a list:
		Stream<String> fromList = list.stream();
		//Do the same except that it creates a stream that is allowed to process elements in parallel:
		Stream<String> fromListParallel = list.parallelStream();
		
		System.out.println("/****** stream generate() ******/");
		Stream<Double> randoms = Stream.generate(Math::random).limit(5);
		randoms.forEach(System.out::println);
		
		System.out.println("/****** stream iterate() ******/");
		Stream<Integer> oddNumbers = Stream.iterate(1, x -> 2*x).limit(5);
		oddNumbers.forEach(System.out::println);
		
		System.out.println("/****** stream min()/max() ******/");
		//The min() and max() methods allow you to pass a custom separator and find the smallest or largest value
		//in a finite stream according to that sort order.
		Stream<String> s = Stream.of("monkey","ape","bonobo");
		Optional<String> min = s.min((s1,s2)->s1.length()-s2.length());
		min.ifPresent(System.out::println);
		Stream<String> ss = Stream.of("monkey","ape","bonoboo");
		Optional<String> max = ss.max((s1,s2)->s1.length()-s2.length());
		max.ifPresent(System.out::println);
		
		System.out.println("/****** stream findAny()/findFirst() ******/");
		//The findAny() and findFirst() methods return an element of the stream unless the stream is empty.
		//If the stream is empty, they return an empty Optional.
		Stream<String> s3 = Stream.of("mokey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(()->"chimp");
		s3.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		System.out.println("/****** stream allMatch()/anyMatch()/noneMatch() ******/");
		List<String> lm = Arrays.asList("monkey", "2", "chimp");
		Predicate<String> pred = x->Character.isLetter(x.charAt(0));
		System.out.println(lm.stream().anyMatch(pred));
		System.out.println(lm.stream().allMatch(pred));
		System.out.println(lm.stream().noneMatch(pred));
		
		
		System.out.println("/****** stream forEach() ******/");
		Stream<String> c = Stream.of("orange", "apple", "strawberry", "kiwi");
		c.forEach(System.out::println);
		
		System.out.println("/****** stream reduce() ******/");
		Stream<String> r = Stream.of("w", "o", "l", "f");
		String r2 = r.reduce("", (x,y)->x+y);
		System.out.println(r2);
		
		System.out.println("/****** stream collect() ******/");
		//The collect() method is a special type of reduction called a mutable reduction
		Stream<String> sco = Stream.of("w","o","l","f");
		StringBuilder word = sco.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word);
		
		
		System.out.println("/****** stream filter() ******/");
		Stream<String> sfilter = Stream.of("monkey", "gorilla", "bonobo");
		sfilter.filter(x->x.startsWith("m")).forEach(System.out::println);
		
		System.out.println("/****** stream distinct() ******/");
		Stream<String> sdistinct = Stream.of("duck", "duck", "duck", "goose");
		sdistinct.distinct().forEach(System.out::println);
		
		
		System.out.println("/****** stream limit()/skip() ******/");
		Stream<Integer> ls = Stream.iterate(1, n -> n+2);
		ls.skip(5).limit(10).forEach(System.out::println);
		
		System.out.println("/****** stream map() ******/");
		//The map() method creates a one-to-one mapping from the elements in the stream to the elements of the next step in the stream
		Stream<String> smap = Stream.of("monkey", "gorilla", "bonobo");
		smap.map(String::length).forEach(System.out::println);
		
		System.out.println("/****** stream flatMap() ******/");
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l->l.stream()).forEach(System.out::println);
		
		System.out.println("/****** stream sorted() ******/");
		Stream<String> ssort = Stream.of("brown", "bear", "zebu", "lion");
		ssort.sorted().forEach(System.out::println);
		
		System.out.println("/****** stream peek() ******/");
		Stream<String> speek = Stream.of("brown", "bear", "zebu", "lion", "zozo");
		long count = speek.filter(x -> x.startsWith("z")).peek(System.out::println).count();
		System.out.println(count);
	}
}

package ch04_streamAPI;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambdas {

	public static void main(String[] args) {
		
		//Normal use
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//Supplier
		//A supplier is used when you want to generate or supply values without taking any input
		System.out.println("/****** SUPPLIER ******/");
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = ()->LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		System.out.println(d1);
		System.out.println(d2);
		
		//Consumer
		//You use a consumer when you want to do something with a parameter but not return anything
		System.out.println("/****** CONSUMER ******/");
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Moon");
		
		//Bi-consumer
		//BiConsumer does the same thing than a consumer except that it takes 2 parameters
		System.out.println("/****** BI-CONSUMER ******/");
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k,v) -> map.put(k, v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map);
		
		//Predicate
		//Predicate is often used when filtering or matching
		System.out.println("/****** PREDICATE ******/");
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		//Bi-Predicate
		//BiPredicate is just like a Predicate except that it takes 2 parameters instead of one
		System.out.println("/****** BI-PREDICATE ******/");
		BiPredicate<String, String> b3 = String::startsWith;
		BiPredicate<String, String> b4 = (string, prefix)->string.startsWith(prefix);	
		System.out.println(b3.test("Mohamed", "M"));
		System.out.println(b4.test("Toto", "t"));
		
		//Function
		//A function is responsible for turning one parameter into a value of a potentially different type and returning it
		System.out.println("/****** FUNCTION ******/");
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		System.out.println(f1.apply("Mohamed"));
		System.out.println(f2.apply("Bourass"));
		
		//Bi-Function
		//Similar to the function except that it takes 2 parameters instead of one
		System.out.println("/****** BI-FUNCTION ******/");
		BiFunction<String, String, String> b5 = String::concat;
		BiFunction<String, String, String> b6 = (x,y)->x.concat(y);
		System.out.println(b5.apply("Mohamed ", "Bourass"));
		System.out.println(b6.apply("Hello ", "world!"));
		
		//UnaryOperator and BinaryOperator are a special case of a function
		//They require all type parameters to be the same.
		
		//UnaryOperator
		System.out.println("/****** UNARY OPERATOR ******/");
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		System.out.println(u1.apply("toto"));
		System.out.println(u2.apply("Mohamed"));
		
		//BinaryOperator
		System.out.println("/****** BINARY OPERATOR ******/");
		BinaryOperator<String> b7 = String::concat;
		BinaryOperator<String> b8 = (x,y) -> x.concat(y);
		System.out.println(b7.apply("toto","tata"));
		System.out.println(b8.apply("mo","carss"));
	}
}

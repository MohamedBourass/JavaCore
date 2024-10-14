package com.mbo.ch01.basics;

import com.mbo.ch01.basics.classes.AnonInner;
import com.mbo.ch01.basics.classes.Lion;
import com.mbo.ch01.basics.classes.Outer;
import com.mbo.ch01.basics.classes.Season;
import com.mbo.ch01.basics.classes.Outer.Inner;


public class Main {
	// POO principles
	//---------------
	// Encapsulation: tight encapsulation loose coupling, high cohesion (keep instance variables private or protected, make public accessors, etc.
	// Polymorphism: Java allows multiple type of objects to be passed to a single method or class
	// every class in Java is a subclass of object
	// the scopes are public, private, protected and default
	// package is the default scope (...)
	// only one public class per source code file ==> check me!
	// a final class cannot be inherited
	// an interface is a contract , its methods are implicitly public and abstract
	// all variables defined in an interface must be public, static and final
	// interface methods cannot be static
	// if there is a method "abstract" in a class, this class must be declared as "abstract"
	// a method cannot be "abstract" and "final", "abstract" and "private" or "abstract" and "static"
	// "synchronized" is applied only to method and indicated a method can be accessed by only one thread at a time
	// a constructor cannot have a return type
	// a constructor cannot be static, final or abstract
	// instance variable cannot be marked as "static"
	// local variables are always on the stack, not on the heap
	// the compiler will reject local variables that has not been assigned value (because no default value) ==> check me !
	// array is always an object on the heap
	// int[] key; //recommended
	// int key[]; //legal but less readable
	// String[][][] toto; //3D array
	// String [] titi[]; //2D array
	// int[5] toto; //not legal
	// final for a primitive means that the value will never be changed
	// final for an object ref means that the ref will not change but the values within the object can change
	// transient means that the variable is ignored if the object is serialized
	// volatile tell the JVM that a thread accessing the variable must always reconcile its own private copy of the variable with the master copy in memory
	// in overriding, the access level cannot be more restrictive than the overridden method
	// you cannot override a method called static
	// the overriding method must not throw checked exception that are new or broader than those declared by the overridden method
	// ordering: init blocks, static init blocks, => check me!
	
	//Garbage collection
	//-------------------
	// the role of GC is to make sure that the heap has as much free space as possible
	// instance variables and objects live on the heap, local variables live on the stack
	// the GC is under the control of the JVM, the JVM decides when to run the GC
	// an object is eligible to GC when no live thread can access it
	// to be eligible = nulling a reference or reassigning a ref variable or isolating a reference
	// the GC cannot be forced, in reality, it is possible only to suggest the JVM to run the GC with the System.gc() which
	// is the same that Runtime.getRuntime().gc();

	// when you use finalize(code)  to run some code before your object is deleted by GC
	
	static class Nested {
		private int price = 6;
	}

	public static void main(String[] args) {
		AnonInner ai = new AnonInner();
		System.out.println(ai.admission(4));
		
		Lion l = new Lion();
		l.clean();
		
		Season s = Season.FALL;
		System.out.println(s);
		
		for(Season c : Season.values())
			System.out.println(c.name() + ", expectedVisitors : " + c + " : " + c.ordinal());
		
		Outer outer = new Outer();
		outer.callInner();
		
		Inner inner = outer.new Inner();
		inner.go();
		
		Nested nested = new Nested();
		System.out.println(nested.price);
	}
}
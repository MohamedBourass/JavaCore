package com.core.ch01.basics;

import com.core.ch01.basics.classes.AnonInner;
import com.core.ch01.basics.classes.Lion;
import com.core.ch01.basics.classes.Outer;
import com.core.ch01.basics.classes.Season;
import com.core.ch01.basics.classes.Outer.Inner;


public class Main {

	
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
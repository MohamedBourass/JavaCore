package com.core.ch02.patterns;

import com.core.ch02.patterns.classes.CanvasFactory;
import com.core.ch02.patterns.classes.Singleton;
import com.core.ch02.patterns.classes.Singleton2;

public class Main {

	public static void main(String[] args) {
		Singleton s11 = Singleton.getInstance();
		Singleton s12 = Singleton.getInstance();
		System.out.println(s11 + " : " + s12);
		
		Singleton2 s21 = Singleton2.getInstance();
		Singleton2 s22 = Singleton2.getInstance();
		System.out.println(s21 + " : " + s22);
		
		CanvasFactory cf = new CanvasFactory();
		//Point p = cf.getPoint(10, 20);
		//System.out.println(p);
		
	}
}

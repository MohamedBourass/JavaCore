package com.core.ch02.patterns.classes;

public class CanvasFactory {
	interface Point<T> {
		public T get();
	}
	
	/*class PointImpl<T> {
		
		boolean z;
		
		PointImpl(T x, T y) {
			z = x.
		}
		
		public T get() {
			return (T) z;
		}
	}
	
	public T getPoint(Integer x, Integer y) {
		return new PointImpl<String>(x, y).get();
	}*/
}

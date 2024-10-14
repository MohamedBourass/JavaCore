package com.mbo.ch04.lambda.classes;

interface Gorilla {
	String move();
}

public class GorillaFamily {
	
	String walk = "walk";
	
	void everyonePlay() {
		play(()->walk);
	}
	
	public static void main(String[] args) {
		
		new GorillaFamily().everyonePlay();
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}

}

package ch06_datetimeAPI;

import java.util.Locale;

public class Strings {


	public static void main(String[] args) {
		String s1 = "1" + 2 + 3;
		String s2 = 1 + 2 + "3";

		System.out.println(s1); //Prints 123
		System.out.println(s2); //Prints 33

		String s = "abcde";
		System.out.println(s.trim().length()); //5
		System.out.println(s.charAt(4)); //e
		System.out.println(s.indexOf("e")); //4
		System.out.println(s.indexOf("de"));//3
		System.out.println(s.substring(2,4).toUpperCase()); //CD => (int,int)=(inclusive, exclusive)
		System.out.println(s.replace("a","1")); //1bcde
		System.out.println(s.contains("DE"));//false
		System.out.println(s.startsWith("a"));//true
		
		StringBuilder b = new StringBuilder();
		//StringBuilder is not synchronized while StringBuffer is synchronized
		b.append(12345).append("-");
		System.out.println(b.length());//6
		System.out.println(b.indexOf("-")); //5
		System.out.println(b.charAt(2)); //3
		System.out.println(String.format("%03d", 1)); //001
		
		Locale locale = Locale.getDefault();
		System.out.println(locale); //fr_FR
	}
}
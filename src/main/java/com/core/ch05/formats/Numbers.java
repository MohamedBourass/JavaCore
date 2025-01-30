package com.core.ch05.formats;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numbers {

	public static void main(String[] args) throws ParseException {
	
		int monthNb = 12;
		int visitorsPerYear = 3_200_000;
		int visitorsPerMonth = visitorsPerYear / monthNb;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA);

		System.out.println(visitorsPerMonth);//Default
		System.out.println(us.format(visitorsPerMonth));
		System.out.println(g.format(visitorsPerMonth));
		System.out.println(ca.format(visitorsPerMonth));

		double price = 48;
		NumberFormat eur = NumberFormat.getCurrencyInstance();
		NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(eur.format(price));
		System.out.println(usd.format(price));

		String s = "40.45";
		System.out.println(NumberFormat.getInstance().parse(s));		
		System.out.println(NumberFormat.getInstance(Locale.US).parse(s));
	}
}
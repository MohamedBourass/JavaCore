package ch06_datetimeAPI;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) throws ParseException {
		int attendeesPerYear = 3_200_00;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		
		double price = 48;
		NumberFormat euroccy = NumberFormat.getCurrencyInstance();
		NumberFormat usccy = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(euroccy.format(price));
		System.out.println(usccy.format(price));
		
		String s = "40.45";
		System.out.println(NumberFormat.getInstance(Locale.FRANCE).parse(s));
		System.out.println(NumberFormat.getInstance(Locale.US).parse(s));
		
		NumberFormat nf = NumberFormat.getInstance();
		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";
		System.out.println(nf.parse(one));
		System.out.println(nf.parse(two));
		//System.out.println(nf.parse(three)); //Exception !!
		
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
		double value = (double) cf.parse(amt);
		System.out.println(value);
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		//System.out.println(shortDateTime.format(time)); //Exception !!!
		
		//Does not work : ?????
		//System.out.println(dateTime.format(shortDateTime));
		//System.out.println(date.format(shortDateTime));
		//System.out.println(time.format(shortDateTime)); 
		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		System.out.println(f.format(dateTime));
	}
}

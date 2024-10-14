package com.mbo.ch05.formats;

import java.time.Instant;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;



public class Dates {

	public static void main(String[] args) {
		
		String pattern = "yyyy--MM--dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
	
		//CREATE CURRENT DATES
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());	

	
		LocalDate date1 = LocalDate.of(1983,Month.OCTOBER,13);
		LocalDate date2 = LocalDate.of(2016,Month.MAY,29);
		LocalTime time1 = LocalTime.of(17,25);
		LocalTime time2 = LocalTime.of(17,25,11);
		LocalTime time3 = LocalTime.of(17,25,11,333);

		LocalDateTime dateTime1 = LocalDateTime.of(1983, Month.OCTOBER, 13, 17, 25, 11);
		LocalDateTime dateTime2 = LocalDateTime.of(date1,time1);
	
		//MANIPULATION OF DATES
		//Old way
		Calendar c = Calendar.getInstance();
		c.set(2015,10,13);
		Date ow = c.getTime();
		System.out.println(ow);
	
		//New way
		LocalDate nw = LocalDate.of(2015,Month.OCTOBER,13);
		System.out.println("NewWay date: " + nw);
	
		nw = nw.plusDays(2);
		System.out.println("+2D: " + nw);
	
		nw = nw.plusWeeks(3);
		System.out.println("+3W: " + nw);
	
		nw = nw.plusMonths(4);
		System.out.println("+4M: " + nw);

		nw = nw.plusYears(2);
		System.out.println("+2Y: " + nw);

		//Period, is day, month, year
		System.out.println("isBefore: " + date1.isBefore(date2));
		Period period = Period.ofYears(32);
		date1 = date1.plus(period);
		System.out.println("After 32Y: " + date1);
		
		//Instant
		Instant now = Instant.now();
		System.out.println("Instant.now(): " + now);
		try {
			Thread.sleep(1023);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant later = Instant.now();
		//Duration is seconds, minutes, hours
		Duration duration = Duration.between(now,later);
		System.out.println("Duration: " + duration.toMillis() + " milliseconds");
		System.out.println(duration = duration.plus(1, ChronoUnit.MINUTES));
		System.out.println("Duration+1Min: " + duration.toMillis() + " milliseconds");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("DateTimeFormatter: " + dtf.format(dateTime1));
	}

}
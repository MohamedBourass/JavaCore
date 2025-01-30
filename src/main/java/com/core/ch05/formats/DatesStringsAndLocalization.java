package com.core.ch05.formats;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatesStringsAndLocalization {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		LocalDate date1 = LocalDate.of(1982, Month.JANUARY, 30);
		LocalDate date2 = LocalDate.of(1983, Month.OCTOBER, 13);
		
		System.out.println(date1);
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.of(12, 12);
		LocalTime time2 = LocalTime.of(17, 25);
		LocalTime time3 = LocalTime.of(17, 25, 34, 233);
		
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		
		LocalDateTime datetime1 = LocalDateTime.of(1983, Month.OCTOBER, 13, 17, 25, 44, 5644);
		LocalDateTime datetime2 = LocalDateTime.of(date2, time2);
		
		System.out.println(datetime1);
		System.out.println(datetime2);
		
		ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Africa")).forEach(System.out::println);
		
		//Old way
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.JANUARY, 1);
		Date ow = c.getTime();
		System.out.println(ow);
		
		//New Way (Java 8 and later)
		LocalDate nw = LocalDate.of(2015, Month.JANUARY, 1);
		System.out.println(nw);
		
		nw = nw.plusDays(2);
		System.out.println(nw);
		
		nw = nw.plusWeeks(1);
		System.out.println(nw);
		
		nw = nw.plusMonths(1);
		System.out.println(nw);
		
		nw = nw.plusYears(5);
		System.out.println(nw);
		
		LocalDate ld = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime lt = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(ld, lt);
		System.out.println(dateTime);
		
		dateTime = dateTime.minusDays(1);
		dateTime = dateTime.minusHours(10);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		LocalDateTime dateTime2 = LocalDateTime.of(ld, lt);
		System.out.println(dateTime2);
		System.out.println(dateTime2.minusDays(1).minusHours(10).minusSeconds(30 ));
		
		//Period
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
		
		System.out.println(Period.of(0, 20, 47));
		System.out.println(Period.ofWeeks(3));
		
		//Duration
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(1));
		System.out.println(Duration.ofMinutes(1));
		System.out.println(Duration.ofSeconds(10));
		System.out.println(Duration.ofMillis(1));
		System.out.println(Duration.ofNanos(1));
		
		
		System.out.println(Duration.of(1, ChronoUnit.DAYS));
		System.out.println(Duration.of(1, ChronoUnit.HOURS));
		System.out.println(Duration.of(1, ChronoUnit.MINUTES));
		System.out.println(Duration.of(10, ChronoUnit.SECONDS));
		System.out.println(Duration.of(1, ChronoUnit.MILLIS));
		System.out.println(Duration.of(1, ChronoUnit.NANOS));
		
		
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDate date = LocalDate.of(2016, 1, 20);
		
		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		//System.out.println(ChronoUnit.HOURS.between(one, date));==> Exception!!
		
		LocalDateTime dateTime3 = LocalDateTime.of(date, one);
		Duration duration = Duration.ofHours(6);
		System.out.println(dateTime3.plus(duration));
		System.out.println(one.plus(duration));
		//System.out.println(date.plus(duration));==> Exception! should use here a period and not a duration!!!
		
		
		//Instant
		Instant now = Instant.now();
		Thread.sleep(123);

		Instant later = Instant.now();
		Duration duration2 = Duration.between(now, later);
		System.out.println(duration2.toMillis());
		
		LocalDate date10 = LocalDate.of(2016, Month.JANUARY, 5);
		LocalTime time10 = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date10, time10, zone);
		Instant instant = zonedDateTime.toInstant();
		
		System.out.println(zonedDateTime);
		System.out.println(instant);
		
		Instant is = Instant.ofEpochSecond(1);
		System.out.println(is);
		Instant nextDay = is.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);
		Instant nextHour = is.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
		//Instant nextWeek = is.plus(1, ChronoUnit.WEEKS); ==> Exception !
		
		//Daylight SavingsTime
		LocalDate date11 = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time11 = LocalTime.of(1,30);
		ZoneId zone11 = ZoneId.of("US/Eastern");
		System.out.println(ZonedDateTime.of(date11, time11, zone11));
		System.out.println(ZonedDateTime.of(date11, time11, zone11).plusHours(1));
		
		//Strings
		String s1 = "1" + 2 + 3;
		String s2 = 1 + 2+ "3";
		System.out.println(s1);
		System.out.println(s2);
		
		String s = "abcde";
		System.out.println(s.trim().length());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf("e"));
		System.out.println(s.indexOf("de"));
		System.out.println(s.substring(2,4).toUpperCase());
		System.out.println(s.replace("a", "1"));
		System.out.println(s.contains("DE"));
		System.out.println(s.startsWith("a"));
		
		StringBuilder b = new StringBuilder();
		b.append(12345).append('-');
		System.out.println(b.length());
		System.out.println(b.indexOf("-"));
		System.out.println(b.charAt(2));
		
		StringBuilder b2 = b.reverse();
		System.out.println(b2.toString());
		System.out.println(b == b2); //????Incredible !!
		
		StringBuilder b3 = new StringBuilder("abcde");
		b3.insert(1, "-").delete(3, 4);
		System.out.println(b3);
		System.out.println(b3.substring(2,4));
		System.out.println(b3);
		
		//Internationalization (i18n) and localization (l10n)
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi","IN"));
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
		
		System.out.println(l1);
		System.out.println(l2);
		
		
		
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy : " + upTo);
			upTo = upTo.plus(period);
		}
	}
}

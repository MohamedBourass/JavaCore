# Chapter 6 - DateTime API

## Dates

```java
public class Dates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
```

```shell
2025-01-30
19:05:44.304005200
2025-01-30T19:05:44.304005200
2025-01-30T19:05:44.304005200+01:00[Europe/Paris]
```


```java
public class Dates {
    public static void main(String[] args) {
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
    }
}
```

```shell
1982-01-30
1983-10-13
12:12
17:25
17:25:34.000000233
1983-10-13T17:25:44.000005644
1983-10-13T17:25
```
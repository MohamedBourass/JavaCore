package com.core.ch01_classesobjects.classes;

public class AnonInner {

	//abstract class SaleTodayOnly {
	//	abstract int dollarsOff();
	//}
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			@Override
			public int dollarsOff() {
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
	
}
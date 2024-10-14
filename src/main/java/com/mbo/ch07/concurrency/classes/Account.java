package com.mbo.ch07.concurrency.classes;

public class Account {

	double balance;
	double id;
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void transfer(Account from, Account to, double amount) {
		from.withdraw(amount);
		to.deposit(amount);
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		
		for(int i = 0; i < 10; i++) {
			acc1.deposit(100);
		}
		
		for(int i = 0; i < 5; i++) {
			acc2.deposit(50);
		}
		
		System.out.println("acc1 balance : " + acc1.balance);
		System.out.println("acc2 balance : " + acc2.balance);
		
		
		for(int i = 0; i < 100; i++) {
			acc1.transfer(acc1, acc2, 1);
		}
		
		System.out.println("acc1 balance : " + acc1.balance);
		System.out.println("acc2 balance : " + acc2.balance);
	}
}

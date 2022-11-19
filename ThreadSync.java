package com.kt.multithreaiding;

class Account {

	public int balance; // 5000

	public Account() {
		balance = 5000;
	}

	public synchronized void withdraw(int bal) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance - bal;
		System.out.println("Amount withdrawn=" + bal); // 500
		System.out.println("Remaing balance=" + balance); // 4500
	}

	public synchronized void deposit(int bal) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance + bal;
		System.out.println("Amount deposited=" + bal);// 1000
		System.out.println("New Balance=" + balance);// 5500
	}

	public synchronized void enquiry() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Available balance=" + balance);
	}
}
class Transaction implements Runnable {

	Account obj; // has-a relation

	Transaction(Account a) {
		obj = a;
	}

	public void run() {
		obj.withdraw(500);
		obj.deposit(1000);
		obj.enquiry();
	}
}

public class ThreadSync {
	public static void main(String[] args) {

		Account a = new Account();
		Transaction w1 = new Transaction(a);
		Thread t1 = new Thread(w1);
		Thread t2 = new Thread(w1);
		t1.start();
		t2.start();
	}
}

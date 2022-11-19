package com.kt.multithreaiding;

public class SuperThread extends Thread {
	public void start() 
		{
		super.start();
			System.out.println("start method");
		}

	
	public void run() {
		System.out.println("run method");
	}
public static void main(String[] args) {
	SuperThread t= new SuperThread();
	t.start();
	
	System.out.println("main thread");
	
}
}

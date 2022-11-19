package com.kt.multithreaiding;

public class MyClassThreadEx implements Runnable {

	@Override
	 public void run() {
		  System.out.println("child thread");
		  System.out.println("child thread name: "+Thread.currentThread().getName());
	  }
	

	public static void main(String[] args) {
		
		
		MyClassThreadEx obj= new MyClassThreadEx();
		
		Thread t= new Thread(obj);
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t.start();// we are creating-child thread
		t1.start();
		t2.start();
		
		System.out.println("main thread");
		
	System.out.println("main thread name :"+Thread.currentThread().getName());
		
	}
}

package com.kt.multithreaiding;

public class NameEx extends Thread {

	
	public void run() {
		
		//System.out.println(Thread.currentThread().getName());
		System.out.println("child:"+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		
		NameEx t= new NameEx();
		t.start();
		t.setName("soma");
	
		//System.out.println(Thread.currentThread().getName());
		
		  //we can set the name of the thread: customized name
	Thread.currentThread().setName("sathya");
	System.out.println("PARENT:"+Thread.currentThread().getName());
		
		
	}
}

package com.kt.multithreaiding;

public class PriorityEx extends Thread {
	
	public void run() {
		
	
		//System.out.println("child"+Thread.currentThread().getPriority());
		System.out.println("child"+Thread.currentThread().getPriority());
	}
public static void main(String[] args) {
	
	PriorityEx obj= new PriorityEx();
	obj.start();
	obj.setPriority(9);
	
	
	//System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(6);
	System.out.println("main"+Thread.currentThread().getPriority());
}
}

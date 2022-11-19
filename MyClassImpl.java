package com.kt.multithreaiding;

public class MyClassImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
      System.out.println("slideshow "+i);
      try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		MyClassImpl m= new MyClassImpl();
		Thread t= new Thread(m);
		
		t.start();
		//t.join(15000);
		
//		for(int i=0;i<=10;i++) {
//		      System.out.println("main thread");
//				}
	}

}

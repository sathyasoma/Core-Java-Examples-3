package com.kt.java8;

//to implement the lambda expression we need functional interface
@FunctionalInterface
interface Interf{
	
	public void m1(); //functional interface has only one abstract method
	
	
}

//class Demo implements Interf
//{
//
//	@Override
//	public void m1() {
//	
//		System.out.println("method m1");
//		
//	}
//	//if you want use lambda expression we dont require to write this class
//	//comment this class and call the lambda in main method
//
//}
public class Test {

	public static void main(String[] args) {
		
//		Interf i= new Demo();
//		
//		i.m1();    //  we can get this o/p by using lambda expression
		
		Interf i=()->System.out.println("method m1");  //if u use this we dont require Demo class
		
		i.m1();
		
	
	}
}

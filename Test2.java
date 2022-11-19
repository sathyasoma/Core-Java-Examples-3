package com.kt.java8;


@FunctionalInterface
interface Squares
{
	public int sqr(int a);
}

public class Test2 {
public static void main(String[] args) {
	
	
	//Squares s=(a)->System.out.println("square of two numbers :"+a*a);
	
	//call the method
	//s.sqr(9);
	Squares s=(a)->a*a;
	
	System.out.println(s.sqr(8));
}
}

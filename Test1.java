package com.kt.java8;

//by using lambda expression
@FunctionalInterface
interface Calci
{
	
public void sum(int a, int b);

}
public class Test1 {

	public static void main(String[] args) {
		
		Calci c= (a,b)->System.out.println(a+b);
		c.sum(45, 63);
	}
}

package com.kt.java8;


//defalut methods in functional inteface with multiple inheritance
interface Left
{
	default void m1()
	{
		System.out.println("default method left class m1");
	}
	
}

interface Right
{
	
	default void m1()
	{
		System.out.println("default method right class m1");
	}

}
public class Test3 implements Left,Right{

	@Override
	public void m1() {
		
		Left.super.m1();
		Right.super.m1();
	}
public static void main(String[] args) {
	
	Test3 obj= new Test3();
	
	obj.m1();
}
}

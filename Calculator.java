package com.coreExamples;

public class Calculator {

	int instaNum=45;
	static float salary=67000.00f;
	public int addNums(int a, int b) {
		return a+b;
	}
	public void subNums(int a, int b) {
		System.out.println("sub of two numbes"+(a-b));
	}
	public static int mulNums(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		  
		char ch='r';
		System.out.println("local variable : "+ch);
		
		Calculator cal= new Calculator();
		System.out.println("instance variable : "+cal.instaNum);
		System.out.println("static variable : "+salary);
		System.out.println("add of two numbers: "+cal.addNums(45, 63));
		
		System.out.println("mul of two numbers :"+Calculator.mulNums(45, 12));
		
	    cal.subNums(45, 23);
		
		
		
	}
}

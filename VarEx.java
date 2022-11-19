package com.coreExamples;

public class VarEx {

	static String name="key"; // static variable
	
	float salary=670.89f; //instance variable
	
	
	public static void main(String[] args) {
		
		int age=78; //local variable
		
		VarEx obj=new VarEx(); //object creation
				
		System.out.println(age);//local
		System.out.println(VarEx.name);//static
		System.out.println(name); //static
		System.out.println(obj.salary);//instance
	}
}

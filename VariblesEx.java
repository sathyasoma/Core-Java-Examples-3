package com.coreExamples;
//variable is name of storage location
public class VariblesEx {
	    int x=12;   //  instance variable
	    static int y=34; //static variable
	    
	    void display() { //instance method without return type,withput any params
	    	System.out.println("i am instance method");
	    }
	
	    void sumOfTwo(int a, int b) { //instance method withput return type,with parameters
	    	
	    	System.out.println("sum of two numbers:"+(a+b));
	    }
	    int subOfTwo(int a, int b) {
			return a-b;
	    	
	    }
	    
	    static void print() {
	    	System.out.println("i am static method");
	    }
	    
	    static void mulOfTwo(int a, int b) {
	    	int age =45;
	    	System.out.println("my age i "+age);
	    	System.out.println("mul of two numbers:"+(a*b));
	    }
	    
	    static int divOfTwo(int a, int b) {
			return a/b;
	    	
	    }
	public static void main(String[] args) {
		
		int l=23;
		int g=34;
		System.out.println(l+g); //local variable printing
		
		
		//object creation
		
		VariblesEx obj= new VariblesEx(); 
		
		//static methods calling by using classname
		
		System.out.println(y);
		
		VariblesEx.mulOfTwo(45, 75);
		VariblesEx.print();
		VariblesEx.divOfTwo(42, 63);
		
		
		//instance methods and variables calling by using object refrence
		
		System.out.println(obj.x);
		System.out.println(obj.subOfTwo(45, 72));
		obj.display();
		obj.sumOfTwo(6, 3);
	
		 
	}
}

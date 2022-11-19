package com.kt.exceptions;

public class Exception3 {

	public static void main(String[] args) {
		
		try {
		int a[]=new int[5];
		a[4]=30/6;
		String s="123";		
		System.out.println(s.length());
		int x= Integer.parseInt(s);
		
		System.out.println("no error "+a[4]+" "+x);
		}	
		
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("please enter valid index");
		}
		catch(ArithmeticException e) {
			System.out.println("dont enter denominator zero");
		}
		catch(NumberFormatException e) {
			System.out.println("we cant convert String to number");
		}
		
		finally {
			System.out.println("executes every time to close the connections");
		}
		System.out.println("remaining lines of the code");
	}
}

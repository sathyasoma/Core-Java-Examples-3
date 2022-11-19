package com.kt.exceptions;

public class Exception2 {
	public static void main(String[] args) {

		try {

			int c = 12 / 0;
			try {
				System.out.println("division");
				int b = 30 / 0;
			} catch (ArithmeticException ae) {
				System.out.println(ae);
			}

			try {
				int a[] = new int[3];
				a[3] = 4;
			} catch (ArrayIndexOutOfBoundsException ae) {  //ArrayIndexOutOfBoundsException ae=new ArrayIndexOutOfBoundsException(); 
				System.out.println(ae);
			} finally {
				System.out.println("always will execute finally block");
			}
			System.out.println("remaining try statemnt");

		} catch (Exception e) {
			System.out.println("handled");
		}
		System.out.println("normal execution");
	}
}

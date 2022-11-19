package com.flowcontrols;

public class SwitchCaseExample2 {
	// without break statment where the condition match from there remaing all will
	// executed with deflaut
	public static void main(String args[]) {

		int i = 3;

		switch (i) {
		case 1:
			System.out.println("Case1 ");
		case 2:
			System.out.println("Case2 ");
		case 3:
			System.out.println("Case3 ");
		case 4:
			System.out.println("Case4 ");
		default:
			System.out.println("Default ");
		}
	}

}

package com.coreExamples;

public class Array1 {
	public static void main(String[] args) {

		// array decalretion in two ways
		// by using new kw, by litteral way
		// int x[]=new int[5], int x[]={1,4,5};

		// String names[]=new String[3];

		String names[] = { "keerthi", "rames", "divya" };
//   names[0]="sonu";
//   names[1]="mahesh";
//   names[2]="sath";
		// names[3]="sath";

		// System.out.println(names[0]);

		/*
		 * for (int i = 0; i <3; i++) { System.out.println(names[i]); }
		 */

		
		  for (int i = 0; i < names.length; i++) { System.out.println(names[i]); }
		 

		/*
		 * for(String s:names) { System.out.println(s); }
		 */
	}
}

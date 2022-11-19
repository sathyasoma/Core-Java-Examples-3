package com.kt.collections;

import java.util.Enumeration;
import java.util.Vector;

//for legacy classes
//vector and stack

public class EnumertorEx {
public static void main(String[] args) {
	Vector ar= new Vector();
	
	  ar.add(new Integer(78));
	  ar.add("sathya");
	  ar.add("tarun");
	  ar.add(345);
	  ar.add('s');
	  ar.add(true);
	  ar.add(67.6f);
	  ar.add(null);
	  ar.add(85.00);
	  
	  System.out.println(ar);
	  
	  //by using enumeration we can iterate the values one b one
	  System.out.println("  by using Enumeration  ");
	  
	 Enumeration result= ar.elements();
	 
	 while(result.hasMoreElements()) {
		 
		 System.out.println(result.nextElement());
		 
		 
	 }
	  
	  
}
}

package com.kt.collections;

import java.util.ArrayList;

public class ArrayEx {
public static void main(String[] args) {
	
	ArrayList ar= new ArrayList();
	  
	for(int i=0;i<10;i++)
		ar.add(i);
	  System.out.println(ar);// printing all the list elemnt at once		
	
System.out.println(": using for loop dispalying :");

      for(int i=0;i<ar.size();i++)
    	  System.out.println(ar.get(i));
      
      
   System.out.println("; usin for each loop :");
   
   for(Object a:ar) {
	   System.out.println(a);
   }
   
   
}
}

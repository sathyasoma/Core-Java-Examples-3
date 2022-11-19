package com.kt.collections;

//implemented class from list interface
//duplicates are allowed
//insertion order is preserved
import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx {
  public static void main(String[] args) {
	
	  
	  ArrayList ar= new ArrayList();//size is 10, formula: cc*3/2+1
	 // Vector v= new Vector();  //10.20,40,80 every time double the size
	  
	  ar.add(new Integer(78));
	  ar.add("sathya");
	  ar.add("tarun");
	  ar.add(345);
	  ar.add('s');
	  ar.add(true);
	  ar.add(67.6f);
	  ar.add(null);
	  ar.add(85.00);
	  
	  System.out.println(ar); //to print the all values
	  
	 //arraylist dont have synch methods,for that dont have thread safety
	  //if our frequent operation is retrival, searching then we go for arraylist
	      // it will implimnet from RandomAccess intrfce
	  //performance is more compare to the vector class
	  
	  
	  
	  ar.add("sathya");
}
}

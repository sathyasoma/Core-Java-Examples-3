package com.kt.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
public static void main(String[] args) {
	
	TreeSet ts= new TreeSet(new MyComparator());
	
	ts.add("bhargav");
	ts.add("arun");
	ts.add("ramesh");
	ts.add("srinu");
	ts.add("nirmal");
	
	System.out.println(ts);
}
}

class MyComparator implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		 	String name=(String) arg0;
		 	String name1=(String) arg1;
		//return name.compareTo(name1);  //alphabetical order
		
		return -name.compareTo(name1);  // reverse alphabetical order
		
	}
	
	
}
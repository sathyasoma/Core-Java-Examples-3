package com.kt.collections;

//duplicates are not allowed

// only homogenous data can be allowed
//we can predect the out put
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> ts= new TreeSet<>();
	
		ts.add("sathya");//comapreTo()
		ts.add("ilesh");
		ts.add("suresh");
		ts.add("soma");
		ts.add("prem");
		ts.add("sathya");
		
		System.out.println(ts);
	}
}

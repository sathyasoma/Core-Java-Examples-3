package com.kt.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class KeySetEx {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm= new TreeMap<>();
		
		tm.put(111, "divya");
		tm.put(113, "raju");
		tm.put(112, "soma");
		tm.put(114, "tarun");
		tm.put(116, "bhargavi");
		
		System.out.println(tm);
		
	Set   <Integer> keys=	tm.keySet();
	
	Iterator result=keys.iterator();
	
	while(result.hasNext()) {
		//System.out.println(result.next());
		System.out.println(result.next());  //it prints the values based on the keys
	}
	
	}

}

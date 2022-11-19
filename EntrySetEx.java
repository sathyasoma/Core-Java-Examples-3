package com.kt.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySetEx {
	public static void main(String[] args) {
		
TreeMap<Integer,String> tm= new TreeMap<>();
		
		tm.put(111, "divya");
		tm.put(113, "raju");
		tm.put(112, "soma");
		tm.put(114, "tarun");
		tm.put(116, "bhargavi");
		
		System.out.println(tm);
		
		Set<Entry<Integer,String>> entry=tm.entrySet();
		
	Iterator itr	=entry.iterator();
	
	while(itr.hasNext()) {
		//System.out.println(itr.next());
		
		  Entry<Integer,String> finalResult = (Entry<Integer, String>) itr.next();
		  
		 // System.out.println(finalResult);
		  
		  System.out.println(finalResult.getKey()+ "   "+finalResult.getValue());
	}
		
	}

}

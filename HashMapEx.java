package com.kt.collections;

import java.util.HashMap;

//dulicates are not allowed
//insertion order is not preserved
public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<>();
		
		hm.put(100, "sathya");
		hm.put(101, "tarun");
		hm.put(102, "divya");
		hm.put(103, "swamy");
		hm.put(104, "raju");
		hm.put(105, "swaraj");
		hm.put(100, "harish");// override the name with harish with 100
		
		System.out.println(hm);
		
		hm.remove(100);
		System.out.println(hm);
		
	System.out.println(hm.containsValue("divya"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.kt.collections;

import java.util.HashMap;
//duplicates are not allowed, insertion order is not preserved
public class HasMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs= new HashMap();
		
		hs.put(111, "sathya");
		hs.put(117, "naresh");
		hs.put(113, "swamy");
		hs.put(118, "prem");
		hs.put(111, "raju");
		hs.put(115, "sathya");
		
		System.out.println(hs);
	}
}

package com.kt.collections;

import java.util.LinkedHashMap;
//dupliates are not allowed
//insertion order is preserved
public class LinkedHasMapEx {
public static void main(String[] args) {
	
	
	LinkedHashMap hs=  new LinkedHashMap();
	
	hs.put(111, "sathya");
	hs.put(112, "naresh");
	hs.put(113, "swamy");
	hs.put(114, "prem");
	hs.put(111, "raju");
	hs.put(115, "tarun");
	
	System.out.println(hs);
}
}

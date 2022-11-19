package com.kt.collections;

//duplicates are not allowed

//insertion order is not prserved

import java.util.HashSet;

public class HasEx {
public static void main(String[] args) {
	
	
	HashSet hs= new HashSet();
	
	//intrnally hashset will use hashmap-->hashcode(keys)
	
	hs.add("sathya");
	hs.add("naresh");
	hs.add(112);
	hs.add("soma");
	hs.add("prem");
	hs.add("sathya");
	
	System.out.println(hs);
	
}
}

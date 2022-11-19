package com.kt.collections;

//duplicates are not allowed 
//insertion oreder is preserved
import java.util.LinkedHashSet;

public class LinkedHasEx {

	public static void main(String[] args) {
	

		LinkedHashSet lhs= new LinkedHashSet();
		
		//intrnally hashset will use hashmap-->hashcode(keys)
		lhs.add("sathya");
		lhs.add("naresh");
		lhs.add(112);
		lhs.add("soma");
		lhs.add("prem");
		lhs.add("sathya");
		
		System.out.println(lhs);
		//duplicates are not allowed
		//insertion order is preserved
	}
}

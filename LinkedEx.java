package com.kt.collections;

import java.util.LinkedList;

public class LinkedEx {
public static void main(String[] args) {
	
	LinkedList li= new LinkedList();
	
	li.add("sathya");
	li.add(143);
	li.add(true);
	li.add('s');
	li.add(null);
	li.add(145.0f);
	
	System.out.println("size is  :"+ li.size());//size of the class(objects)
	System.out.println("contains sathya :"+li.contains("sathya"));
	System.out.println("First element :"+li.getFirst());
	System.out.println("last element :"+li.getLast());
	System.out.println("is empty :"+li.isEmpty());
	System.out.println("removes the first ele index :"+li.remove());
	System.out.println("after remove size is : "+li.size());
	System.out.
	println("remove 0 th index elemnt :"+li.remove(0));
	System.out.println("after remove 0 th index elemnt size is :"+ li.size());

	
	System.out.println(li);
}
}

package com.kt.abstraction;

//abstract parent class
abstract class Animal{
 //abstract method
 public abstract void sound();
 Animal(){System.out.println("animal abstarct");}
}
//Dog class extends Animal class
public class Dog extends Animal{

	   public void sound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		Animal obj = new Dog();
		obj.sound();
	   }
}

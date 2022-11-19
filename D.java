package com.kt.inheritance;

//HYbrid inheritance

class C1
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A1 extends C1
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B1 extends C1
{
   public void disp()
   {
	System.out.println("B");
   }
	
}
public class D extends A1 {

	public void disp()
	   {
		System.out.println("D");
	   }
	   public static void main(String args[]){

		D obj = new D();
		obj.disp();
	   }
}

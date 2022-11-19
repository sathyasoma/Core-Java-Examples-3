package com.kt.exceptions;

public class ThrowsEx {
	
    public void pass(int marks){
	     
		  if(marks<35) 
		    throw new ArithmeticException("you are failed");
	 else
	 {
	    System.out.println("you are passed :" +marks);
	 }
}
   public static void main(String args[]){
	
	         ThrowsEx m= new ThrowsEx();
			 m.pass(30);
	
	} 

}

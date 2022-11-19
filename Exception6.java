package com.kt.exceptions;


class MyException extends Exception{

    private int age;
	
	public MyException(int age){
	   this.age= age;
	}
	
	public String toString(){
	   return "you are not eligeble for vote:"+age;
	}
}
public class Exception6 {
	
    static void validation(int age) throws MyException {
	      if(age<18)
		           throw new MyException(age);
				else
				System.out.println("you are eligeble for vote");
	 }
	 
	 public static void main(String args[]) throws MyException {
	 
	   Exception6.validation(1);
	   System.out.println("rest of the code");
	          
	 }

}

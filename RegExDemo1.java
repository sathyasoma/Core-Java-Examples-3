package com.kt.regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

public static void main(String args[]){

             int   count=0;   //to count how many itertions
			 
           Pattern p = Pattern.compile("ab");    //pattern/Re
		   
		   Matcher m= p.matcher("ababbabab");
		   
		   while(m.find())
		   {
		      count++;
		   System.out.println(m.start()+"  "+m.end()+"   "+m.group());
		     //start() method will return start index
		   //end()-> method will return end index: +1 value  return=>
		   //group()-->method will return group values wich matched
		   }
		   System.out.println("The number of occurences are:"+count);
}
}

package com.kt.datetime;

import java.time.Year;

public class LeapYrEx {

public static void main(String args[]){

int n= Integer.parseInt(args[0]);

Year y= Year.of(n);
if(y.isLeap())
{
System.out.printf("%d is leap year "+n);
}else
{
System.out.printf("%d is not leap year"+n );
}




}
}

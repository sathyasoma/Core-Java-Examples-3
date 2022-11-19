package com.kt.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDT {


public static void main(String args[]){


LocalDateTime dt= LocalDateTime.now();

System.out.println(dt);


LocalDateTime dt1= LocalDateTime.of(1994,Month.JUNE,04,01,23);

System.out.println(dt1);

//want to disply after 6 mnths

System.out.println("after six months:"+dt1.plusMonths(6));

//before six months

System.out.println("before six months:"+dt1.minusMonths(6));

}
}

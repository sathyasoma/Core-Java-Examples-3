package com.kt.datetime;

import java.time.LocalDate;
import java.time.Period;

public class FindAgeEx {


public static void main(String args[]){


LocalDate today=LocalDate.now();


LocalDate birthdy= LocalDate.of(1994,06,04);

//we have to use period class

Period p= Period.between(birthdy,today);

System.out.println("age is %d years %d months %days" +p.getYears()+""+p.getMonths()+""+p.getDays());


 
}
}

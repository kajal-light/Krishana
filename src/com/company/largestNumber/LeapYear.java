package com.company.largestNumber;

public class LeapYear {

    public static boolean getLeapYear(int a){

       if(a%4==0 && a%100!=0){
           return true;


       } else if(a%400==0){

           return true;
       }else{

           return false;

       }

    }
}

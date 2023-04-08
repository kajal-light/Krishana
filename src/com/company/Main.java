package com.company;

import com.company.largestNumber.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Largest number is:  " + LargestNumber.getLargestNumber(3, 4, 6));
        //leap year
       //year must divide by 4 but not 100
        //year also divide by 400
        System.out.println("isLeapYear:  " + LeapYear.getLeapYear(2000));
       //calculator
      //  System.out.println(Calculator.getAns());
      //Pattern
      //  SquarePattern.print();
    //find factorial
        System.out.println("factors is:" + Factorial.getFactor(5)) ;
    //count of table
       // TableOfNumber.getTable(3,10);
    //GCD
       // System.out.println("GCD IS:" + Gcd.getGcd(10,15));
//AllDivisorsOfNumber
        AllDivisorsOfNumber.getAllDivisorsOfNumber(15,"MORE_EFFICIENT");
    }
}
package com.company;

import com.company.arraysString.*;
import com.company.loops.*;

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
     // SquarePattern.print();
    //find factorial
        System.out.println("factors is:" + Factorial.getFactor(5)) ;
    //count of table
        TableOfNumber.getTable(3,10);
    //GCD
       // System.out.println("GCD IS:" + Gcd.getGcd(10,15));
//AllDivisorsOfNumber
      AllDivisorsOfNumber.getAllDivisorsOfNumber(9,"MORE_EFFICIENT");
        //all prime

        System.out.println("isPrime " + Prime.isPrime(4,"MORE_EFFICIENT"));
        Fibonacci.getFibonacci(8);
        System.out.println(FirstDigit.isFirstDigit(5234,"EFFICIENT"));

        PrimeFactor.getPrimeFactor(100);

        SumAndAverageArray.getSumAndAverage();
        MaximumArray.getMaximumArray();
        DistinctArray.getDistinctArray();
        System.out.println(IsArraySorted.getIsArraySorted());
        PatternSearching.getPattern();
    }
}
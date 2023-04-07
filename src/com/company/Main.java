package com.company;

import com.company.largestNumber.Calculator;
import com.company.largestNumber.LargestNumber;
import com.company.largestNumber.LeapYear;
import com.company.largestNumber.SquarePattern;

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

        SquarePattern.print();

    }
}
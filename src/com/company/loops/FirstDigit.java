package com.company.loops;

public class FirstDigit {

    public static int isFirstDigit(int n, String s){

        if (Efficiency.isBasic(s)) {
            while(n>10) {
                n=n/10;
            }
            return n;
        } else if (Efficiency.isEfficient(s)) {

double log=Math.log10(n);
int pow=(int)log;
int a= (int) Math.pow(10,pow);
n=n/a;



    }

    return n;
}}

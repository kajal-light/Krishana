package com.company.largestNumber;

public class Fibonacci {

    public static void getFibonacci(int n) {
//for zeroth and 1st stair
int a=1;
int b=1;

if(n==1 || n==0){

    System.out.println(1);
}else {


    for (int i = 0; i <= n; i++) {

        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;

    }
}

    }

}

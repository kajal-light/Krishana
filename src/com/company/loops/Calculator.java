package com.company.loops;

import java.util.Scanner;

public class Calculator {

    public static int getAns(){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number: \n 1.add\n 2.sub \n 3.multi");

        int a=sc.nextInt();
        int n1 = 0;
        int n2 = 0;


        if(a!=1 && a!= 2 && a!=3) {
            System.out.println("invalid");
        }else{
            System.out.println("enter 1st number");
            n1=sc.nextInt();
            System.out.println("enter 2nd number");
            n2=sc.nextInt();

        }

        if(a==1){
            return n1+n2;
        }else if(a==2){

            return n1-n2;

        }else{
            return n1*n2;
        }

    }
}

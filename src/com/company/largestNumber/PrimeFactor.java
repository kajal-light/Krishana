package com.company.largestNumber;

public class PrimeFactor {


    public static void getPrimeFactor(int n){

        for(int i=2;i<n;i++){
            if(Prime.isPrime(i,"BASIC")){
                int x=i;
                while(n%x==0){

                    System.out.println("prime factors" +i);
                       x=x*i;

                }


            }


        }


    }



}

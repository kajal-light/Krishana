package com.company.loops;

public class Gcd {

 public static int getGcd(int a,int b){

   //1.find the min of a and b
   //2.iterate from 1 to min
     int min=Math.min(a,b);
     int ans=1;
   for(int i=1;i<=min;i++){

       if(a%i==0 && b%i==0){

      ans=i;
       }


   }

     return ans;

 }




}

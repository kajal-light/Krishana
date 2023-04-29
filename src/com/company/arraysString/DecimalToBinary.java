package com.company.arraysString;

public class DecimalToBinary {

    public static String getConverted(int n){
        String s="";
       while(n>0){

         s=n%2+s;
          n=n/2;
       }

       return s;
    }



}

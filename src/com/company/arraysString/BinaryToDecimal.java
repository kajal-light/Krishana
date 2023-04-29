package com.company.arraysString;

public class BinaryToDecimal {


    public static int getConverted(String s) {

        int k=1;
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){

          ans+=(s.charAt(i)-'0')*k;
k=k*2;
        }

       return ans;

    }

}

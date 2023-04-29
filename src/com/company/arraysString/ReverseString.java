package com.company.arraysString;

public class ReverseString {

    public static String getReverseString(String n){
        String s="";
        for(int i=n.length()-1;i>=0;i--){

           s=s+n.charAt(i) ;


        }
        return s;

    }
}

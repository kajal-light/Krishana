package com.company.arraysString;

public class PatternSearching {


    public static void getPattern(){

        String str="geek for geek";
String str1="12.345";
        int pos=str.indexOf("geek");

        while(pos>=0){

            System.out.println(pos + " ");
           pos=str.indexOf("geek",pos+1);

        }
//12.345==345

    int pointIndex=str1.indexOf(".");
        if(pointIndex<0){
            System.out.println(" ");
        }else{

            System.out.println(str1.substring(pointIndex+1));


        }



    }



}

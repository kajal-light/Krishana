package com.company.arraysString;

public class CheckPalindrome {

    public static boolean getCheckPalindrome(String n) {

     for(int i=0;i<n.length();i++){
       for(int j=n.length()-1;j>=0;j--){
           if(n.charAt(i)!=n.charAt(j)){
               return false;

           }
           return true;

       }



     }

        return true;

    }

}

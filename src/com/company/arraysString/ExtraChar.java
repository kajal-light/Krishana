package com.company.arraysString;

public class ExtraChar {


//Given two strings which are of lengths n and n+1.
// The second string contains all the character of the first string, but there is one extra character.
// Your task to find the extra character in the second string.
  public  static  char getExtra(String s1,String s2){
    char ans = '0';

    for(int i=0;i<s2.length();i++){
      ans=s2.charAt(i);
      if(s1.indexOf(ans)>0){
        continue;

      }else{
       return ans;

      }



    }

    return ans;
    }



}

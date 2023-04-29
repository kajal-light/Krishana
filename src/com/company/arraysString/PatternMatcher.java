package com.company.arraysString;

public class PatternMatcher {

//    You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
//As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.


   public static void follPatt(String s){

int i=0;
int count=0;
while(i<s.length()){

    while(i<s.length() && s.charAt(i)=='x'){
        count++;
        i++;

    }
    while(i<s.length() && s.charAt(i)=='y'){

        count--;
        i++;

    }
if(count!=0){
    System.out.println("0");
break;
}


}

if(count==0){

    System.out.println("1");

}



    }


}

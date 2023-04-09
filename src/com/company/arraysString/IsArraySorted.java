package com.company.arraysString;

public class IsArraySorted {



    public static boolean getIsArraySorted(){
        int[] arr={10,2,3,4,5};
        int max = Integer.MIN_VALUE;
boolean result=true;
        for(int i=1;i<arr.length;i++){

            if(arr[i]<arr[i-1]){

            result=false;
               break;

            }

        }
        return result;
}
}

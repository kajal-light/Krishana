package com.company.arraysString;

public class MaximumArray {


    public static void getMaximumArray(){
    int[] arr={1,2,3,4,5};
    int max = Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
      if(max<arr[i]){

          max=arr[i];
      }
    }


        System.out.println( "max " + max);

}
}

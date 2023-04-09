package com.company.arraysString;

public class SumAndAverageArray {

    public static int getSumAndAverage(){

        int[] arr={1,2,3,4,5};
        int sum = 0;
        double avg;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }

       avg=sum/arr.length;
        System.out.println(avg +" " + sum);
        return sum;
    }

}

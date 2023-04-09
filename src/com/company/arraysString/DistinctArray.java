package com.company.arraysString;

public class DistinctArray {


    public static void getDistinctArray(){
        int[] arr={1,2,3,3};
       int count=0;
       boolean isDistinct=true;

        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--)

            if(arr[i]==arr[j]){

                isDistinct=false;
                break;
            }

            if(isDistinct==true){

                count++;
            }
            isDistinct=true;
        }


        System.out.println( "isDistinct " + count);

    }
}

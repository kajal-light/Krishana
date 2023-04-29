package com.company.dsa;

public class RemoveDuplicate {


    public static int getRemoveDuplicate() {
        int[] arr = {10,20,20,30,30,30,40};
int res=1;
        for (int i = 1; i < arr.length; i++) {
          if(arr[i]!=arr[res-1]){
            arr[res]=arr[i];
              res++;

          }


        }
 return res;
    }

}








package com.company.dsa;

public class ReverseArray {


    public static void getReverseArrayElement() {
        int[] arr = {1, 0, 7, 2};

        int low = 0;
        int high = arr.length-1;
       while(low<high){
int temp=arr[low];
arr[low]=arr[high];
           arr[high]=temp;

low++;
high--;

       }
for(int i=0;i<arr.length;i++){

    System.out.println(arr[i]);

}

    }
}
package com.company.dsa;

public class SecondLargestElement {

    public static int getSecondLargestElement() {
        int[] arr = {1,0,7,2};

        int res=-1;
int largest=0;
        for (int i = 1; i < arr.length ; i++) {
if(arr[i]>arr[largest]){

    res=largest;
    largest=i;
}else if(arr[i]!=arr[largest]){
    if(res==-1 || arr[i]>arr[res]){
        res=i;


    }


}


        }
return res;
    }

}

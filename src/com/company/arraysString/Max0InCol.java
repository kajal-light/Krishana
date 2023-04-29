package com.company.arraysString;

public class Max0InCol {


    //Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.
    public static int getMaxZeros(int a[][],int n) {


        int count = 0;
        int maxCount = 0;
        int index = 0;

        for (int i=0;i<n;i++) {
count=0;

for(int j=0;j<n;j++){

    if(a[j][i]==0){

        count++;
    }

}
if(maxCount<count){
    maxCount=count;
    index=i;


}


        }
return index;
    }



}

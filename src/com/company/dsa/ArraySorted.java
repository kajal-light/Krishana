package com.company.dsa;

public class ArraySorted {

    public static boolean getSortedArray() {
        int[] arr = {1,4,7,2};

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }

        }
        return true;
    }
}

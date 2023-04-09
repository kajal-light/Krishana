package com.company.loops;

public class Prime {


    public static boolean isPrime(int n, String s) {

        if (n == 1) {
            return false;
        }
        if (Efficiency.isBasic(s)) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else if (Efficiency.isEfficient(s)) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;


        } else if (Efficiency.isMoreEfficient(s)) {
            if (n == 2 || n == 3) {
                return true;

            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;

            }
            for (int i = 5; i * i <= n; i = i + 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;


        }

        return false;


    }
}


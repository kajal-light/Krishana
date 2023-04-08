package com.company.largestNumber;

public class AllDivisorsOfNumber {

    public static void getAllDivisorsOfNumber(int a,String n){
if(Efficiency.isBasic(n)) {
    for (int i = 1; i <= a; i++) {
        if (a % i == 0) {

            System.out.println("all divisors" + i);
        }
    }
}else if(Efficiency.isEfficient(n)){
//all divi come in a pair and one number among all pairs is small
//iterate from 1 to square root of n and print all divisior
    //checkek if divi are same or not with n/i
    //if not then print n/i value
    //x*y<=n
    //:x<=y
    //x<=squreroot(n);

    for (int i = 1; i*i <= a; i++) {
        if (a % i == 0) {

            System.out.println("small divisor" + i);
            if(i!=a/i){
                System.out.println("larger divisor" + a/i );
            }
        }
    }


}else if(Efficiency.isMoreEfficient(n)){
//it give sorted order
int i;
 for( i = 1; i*i <a; i++) {
        if (a % i == 0) {

            System.out.println("small divisor" + i);

            }
        }
    for( ; i>=1; i--) {
        if(a % i == 0){
            System.out.println("larger divisor" + a/i );
        }
    }

    }



else{

    System.out.println("invalid");

}



    }

}

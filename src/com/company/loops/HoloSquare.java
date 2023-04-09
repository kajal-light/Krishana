package com.company.loops;

public class HoloSquare {

    public static void square(int s){
        s=4;
    for(int i=1;i<=s;i++){

        if(i == 1 || i==s){

            for(int j=0;j<s;j++){

                System.out.print("* ");

            }

            System.out.print("\n");

        }

        else if(i>1 && i<s){

            for(int j=0;j<s;j++){

                if(j==0 || j==s-1){

                    System.out.print("* ");

                }

                else{

                    System.out.print("  ");

                }

            }

            System.out.print("\n");

        }

    }

}
}

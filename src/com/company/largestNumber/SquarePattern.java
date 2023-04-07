package com.company.largestNumber;

import java.util.Scanner;

public class SquarePattern {

    public static void print(){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter input: \n 1.square pattern \n 2.pyramid \n 3.right angle triangle");

        int a=sc.nextInt();

        System.out.println("Please enter number of rows");
        int r=sc.nextInt();


        if(a==1){
          int i=0;
          while(i<=r){
              int j=1;
              while(j<=r){
                  System.out.print(" * ");
                  j++;
              }
              i++;
              System.out.println();
          }
        }else if(a==2){
          //1st space n-1
          //how many star in 1th colm
            int i=1;
            while(i<=r){
                int j=1;
                while(j<=(r-i)){
                    System.out.print(" ");
                    j++;
                }
                int k=1;
                while(k<=(2*i-1)){
                    System.out.print("*");
                    k++;
                }
                i++;
                System.out.println();
            }

        }else if(a==3){
            int i=1;
            while(i<=r){
                int j=1;
                while(j<=i){
                    System.out.print("*");
                    j++;
                }

                i++;
                System.out.println();
            }
            }else{

            int i=1;
            while(i<=r){
                int j=1;
                while(j<=(r-i)){
                    System.out.print(" ");
                    j++;
                }
                int k=1;
                while(k<=i){
                    System.out.print("*");
                    k++;
                }
                i++;
                System.out.println();
            }





        }

    }

}







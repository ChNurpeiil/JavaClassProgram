package com.java.class22;

public class Homework5Pattern {
    public static void main(String[] args) {
//        5.  Write a program to print the below pattern
//    *
//   ***
//  *****
// *******
//*********

            for (int i =1; i<=5;i++){
                for (int j = 1; j <= 5-i; j++){
                    System.out.print(" ");
                }
                for (int j = 1; j<=i *2 - 1; j++ ){

                    System.out.print("*");
                }
                System.out.println();

        }
    }
}

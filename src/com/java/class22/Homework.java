package com.java.class22;
//6.  Write a program to print the below pattern
//    *********
//     *******
//      *****
//       ***
//        *
public class Homework {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 11 - 2 * i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

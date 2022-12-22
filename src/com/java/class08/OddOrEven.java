package com.java.class08;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        /**> ** Write a program to take a number from the user
         * and check whether given number is odd or even
         * even number are the numbers that are divisible by 2 -->2,4,6,8,10
         *
         *
         *
         *
         *
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number");

        int num = input.nextInt();
        //when I divide the number by 2 and there is no rema
        //
        //
        if (num % 2 == 0){
            System.out.println(num+"is an even number");
        }
        else {
            System.out.println(num+"is an odd number");
        }
    }
}

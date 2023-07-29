package com.java.class19;

import java.util.Scanner;

// write  a program to find factors of given number
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();
        for (int i = 1; i<=num; i++){
            if (num % i ==0){
                System.out.println(i);
            }
        }
    }
}

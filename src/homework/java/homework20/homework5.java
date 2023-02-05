package com.java.homework.homework20;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
//Write a program to print the reverse of the given number
//Example1
//Input - 86545
//Output - 54568
//Example2
//Input - 23561
//Output - 16532
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int i = sc.nextInt();
        int j = 0;
        while (i > 0){
            j = j * 10 + i % 10;
            i = i / 10;
        }
        System.out.println(j);
    }
}

package com.java.class20;

import java.util.Scanner;
//write a program to print each digit in different line of the given number
//in output in reverse order

//Input 1234
//Output
//4
//3
//2
//1
public class DisplayDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();


        while (num > 0){
            System.out.println(num % 10);
           // num = num %10;
            num = num / 10;//remove one digit from number



        }


    }
}
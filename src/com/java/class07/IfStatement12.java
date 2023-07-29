package com.java.class07;

import java.util.Scanner;

public class IfStatement12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age = sc.nextInt();
//
//        //take  age from user
//
//        //write a program that tells me if I am eligible to drive
//       // int age = 19;
//        //print out you are eligible to drive for people older than 16
//
//        if (age > 16){
//            System.out.println("You are Eligible to Drive");
//        }
//
//        if (age <= 16){
//            System.out.println("You are too Young");
//        }


        //Write a program that asks the user for weather in fahrenheit
        //if it's weather is less than 32f than print out it's Freezing. Stay Home
        // if weather is more than or equal to 32 and less than 41 print out -> it's little chilly outside
        //if weather is more than or equal to 42 and less 68 -> print out -> it's a good weather outside. Go get some Fresh air
        //if weather is more than or equal to 68-> print out it's amazing outside.Let's go to pool and vitamin D
        System.out.println("What the weather like?");
        int weather = sc.nextInt();

        if (weather < 32) {
            System.out.println(" it's Freezing outside! Stay home");
        }

        if (weather >= 32 && weather < 41) {
            System.out.println("it's little chilly outside");
        }

        if (weather >= 42 && weather < 68) {
            System.out.println("it's a good weather outside. Go get some Fresh air ");
        }

        if (weather >= 68) {
            System.out.println("it's amazing outside.Let's go to pool and vitamin D.");
        }

    }
}

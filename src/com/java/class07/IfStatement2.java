package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in)

        int age =18;
        if (age>16){
            System.out.println("You are Eligible to Drive");
        }




        Scanner input = new Scanner(System.in);

        System.out.println("What the weather like?");
        int weather = input.nextInt();

        if (weather < 32) {
            System.out.println("it's freezing outside! Stay home");
        }

        if (weather >= 32 && weather < 42) {
            System.out.println("it's little chilly outside");
        }

        if (weather >= 42 && weather < 68) {
            System.out.println("it's a good weather outside. Go get some Fresh air.");
        }

        if (weather >= 68) {
            System.out.println("it's amazing outside. let's go to pool and vitamin D.");
        }
    }
}

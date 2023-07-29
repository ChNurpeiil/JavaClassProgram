package com.java.class08;

import java.util.Scanner;

public class FlightHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  ! -> negating sing only works with booleans
        //it's very useful in if statements
        //where you want to execute the logic only when
        //condition id negative
        System.out.println(!true);

        boolean doesHaveDriveLicense = false;

        if (!doesHaveDriveLicense){
            System.out.println("Give ticket");
        }



        System.out.println("Welcome to the Kyrgyz Air Line:");
        System.out.println("Are you travelling from connecting flight");
        boolean isConnecting = sc.nextBoolean();

        if (!isConnecting){
            System.out.println("Please proceed to the security check");
        }
        System.out.println("Enjoy your flight!");

        System.out.println("-----------------");

        System.out.println("Welcome to the Kyrgyz Air Line:");
        System.out.println("Are you travelling from connecting flight");
        String isConnecting2 = sc.next();

        if (!isConnecting2.equals("yes")){
            System.out.println("Please proceed to the security check");
        }
        System.out.println("Enjoy your flight!");
    }
}

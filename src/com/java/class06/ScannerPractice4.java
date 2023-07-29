package com.java.class06;

import java.util.Scanner;

public class ScannerPractice4 {
    //write a program for login functionality
    //ask a user to input username
    //and password
    //if username is "best@devx.com"
    //password is "Fall2022"
    //then print out true
    //otherwise print out false
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your userName ");
        String username = sc.next();

        System.out.println("Please enter your password");
        String password = sc.next();

        boolean isLoginIn = username.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");
        System.out.println(isLoginIn);
    }
}

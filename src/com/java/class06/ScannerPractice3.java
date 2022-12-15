package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //wrrite a program for login funtioinality
        //ask a user to input username
        //and password
        //if username is "best@devx.com"
        //password is "Fall2022"
        //then print out true
        //otherwise print out false
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your");
        String username = input.next();

        System.out.println("Password");
        String  password = input.next();

        boolean isLoggedIn = username.equalsIgnoreCase("best@devx.com")  && password.equals ("Fall2022");
        System.out.println(isLoggedIn);



    }
}

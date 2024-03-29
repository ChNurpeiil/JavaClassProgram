package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //write a program for login functionality
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


        //anotherString has no functionality, except giving us a hint that we need to put another String inside();
        boolean isLoggedIn = username=="best@devx.com"  && password=="Fall2022";
        System.out.println(isLoggedIn);

        /*
        ==
        !=
        needs to be used with caution when using for Strings
        you can use ==, != when only working with constant values
        when you are taking the values from user ==, != do not work
        like want it to.

        for Strings the best way to compare is to use .equals()
        every String variable has .equalsIgnoreCase()

        if you want to compare not equals with Strings
        !var.equals("expectedResult");
         */



        /*
        equalsIgnoreCase() -->methods that compares two strings
        it will return true regardless of the cases
        ex: "Askar".equalsIgnoreCase("askaR)-> return true

        equals () -> wil return true only if all character and  their cases
        match
        ex: "Askar.equals("askaR") -> return false
        equals() -> good for passwords
        equalsIgnoreCase() -> good for username
         */




        /*HOMEWORK: Scanner.
        Write a credit landing program
        get user input for age, creditScore, marital status

        printout Approved: true
        if user is older than 25
        if user has a creditScore more than 700
        if user is married

        printout Approved: false
        if any of the conditions is wrong

         */

    }
}

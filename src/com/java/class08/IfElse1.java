package com.java.class08;

public class IfElse1 {
    public static void main(String[] args) {
        boolean doesHaveLicense = false;

        //

        //
        //


        // the program
        if (doesHaveLicense) {
            System.out.println("Have a safe Trip!");

        }
        //
        //
        //so the program
        // I have to write the logic
        if (!doesHaveLicense) {
            System.out.println("Here is your ticket");
        }

        if (doesHaveLicense){
            System.out.println("Have a safe Trip!");
        }
        else {
            System.out.println("Here is your ticket");
        }



        //if the user has a license and their speed is less than 80m/hr

        boolean hasLicense = true;
        int speed = 70;

        if (hasLicense && speed < 80){
            System.out.println("have a safe journey");
            System.out.println("Be careful it's snowing today");
        }
        //
        //
        //
        else {
            System.out.println("Give a ticket 2");
            System.out.println("Please obey the rules");
        }


    }
}

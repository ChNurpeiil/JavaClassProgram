package com.java.class08;

public class ElseIF {
    public static void main(String[] args) {
        // hasLicense
        //seedLimit
        //if hasLicense snd speedLimit is more that 80
        //then say Safe Journey
        boolean hasLicense = true;
        int speed =70;

        if (hasLicense && speed <80){
            System.out.println("have a safe Journey");
        }
        else if (hasLicense && speed > 80){
            System.out.println("Here is your  speeding ticket");
        }
        else if (!hasLicense && speed < 80){
            System.out.println("We have to tow your car");
        }
        else if (!hasLicense &&speed > 80){
            System.out.println("You must appear in the court");
        }

        else if (!hasLicense && speed < 80){
            System.out.println("You must appear in the court");

        }
        else {
            System.out.println("Buy a car");
        }
        //the coding standard
        //usually the pairs go as
        //if
        //one or more else ifs
        //else


    }
}

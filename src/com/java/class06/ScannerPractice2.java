package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //nexInt(), nexLine(), nexBoolean(),  --> they are all
        //methods
        //all mentids return a result. make sure you know what data type y
        //the mentod returs

        //
        //
        System.out.println("Please Enter your age and hit Enter");
        int age = input.nextInt();
        System.out.println("Your age is"+ age);

        System.out.println("Please enter your credit score between 0-820 ");
        int creditScore = input.nextInt();
        System.out.println("Your Credit Score" + creditScore);

        //ask a user their marital status
        //married, single
        //true, false

        System.out.println("ask a user their marital status" );
        String maritalStatus = input.next();
        System.out.println("is married" );
    }


}

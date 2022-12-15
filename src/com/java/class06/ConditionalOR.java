package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        // ConditionalOR ||
        //is used for setting multiple conditions
        // and overall result is true only if one them is true.

        //ex: i want to give discounts to multiple group of people
        // if you are older than 60
        //if you are yonuger than 8

        int age = 25;

        boolean giveDiscount = age <= 60 || age >= 8;
        System.out.println(giveDiscount);

        // difference between && --> all conditions must true
        //||--> at least one of them must true;

        // if 24 hr time

        int currentTime=13;

        // drink coffe should be if current time is 6-11.
        boolean drinrCoffee = currentTime <= 6 || currentTime <= 11;
        System.out.println(drinrCoffee);
        // tell me when I can stsrt to relax
        // when you completed 5  or more java exercises
        // or when you recorded 2 soft-skills videos

        int howManyJavaExerccises = 3;
        int howManySoftskillsVideos= 2;
        boolean canIrelaxNow = howManyJavaExerccises <= 5 && howManySoftskillsVideos ==2;
        System.out.println(canIrelaxNow);

        //////

        //Banking industry application;
        // when should the bank account be blocked?
        //loginAttempts more than 3
        //transaction amount is more than $3000
        //location of transaction --> must match your current location

        int number0fLoginAttempts = 3;
        double transactionAmount = 3400.0;
        String location0fTransaction = "USA"; // ==, !=

        boolean block =number0fLoginAttempts >= 4 || transactionAmount >= 5000 || location0fTransaction == "USA";
        //black =false;
        System.out.println(block);

        ////
        // you store text in a String data type
        //you can only compare strings with ==, !=
        // you can not do >, <, <==




    }

}

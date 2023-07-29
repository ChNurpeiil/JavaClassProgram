package com.java.class12;

public class NewMethodIntro {
    public static void main(String[] args) {

        goTo("Mecca");
        goTo("Turkey");
        goTo("France");
        goTo("USA");
        goTo("Palestina");

    }
    //write a function that calculates
    // employees annual tax amount.
    //if the annual salary is less than 100k then tax percent is 10%
    //if more than 15%;
    public static double calculateTax2(double annualSalary){
        if (annualSalary <= 100000){
            return annualSalary * 0.10;
        }else {
            return annualSalary * 0.15;
        }
    }
    //Create a function that prints "I want to travel to _____"
    //____-> should be a variable.
    //I used be able to use this method multiple times and just provide different
    //values

    public static void goTo(String destination) {
        //the biggest different between a parameters and variable is that
        //variables need to be initialized right away.

        //  String destination = "Mecca";
        System.out.println("I want to travel to "+destination);
    }
}

package com.java.class07;

// if statement is a logical flow control
//you can write a program that executes certain of the code
//only in certain conditions
public class IsElse {
    public static void main(String[] args) {


//        if (true){
//            System.out.println("Hello World");
//            System.out.println("Hello Jupiter");
//        }
//
//        //proceed with a normal execution
//        System.out.println("I am outside of If Statement");



        //when you have only one statement inside if statement
        //you can skip{}
        if (false)
            System.out.println("Hello mars");
        System.out.println("Hello Saturn");// this line is in fact outside of the if statement scope
        //it will print in only condition


        //I want to print out hello Venus only if my gallonOfOil is more than 1000;
        int gallonOfOil = 400;


        if (gallonOfOil > 1000){
            System.out.println("Hello Venus");

        }









    }

}

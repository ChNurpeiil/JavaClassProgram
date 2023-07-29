package com.java.class13;

import java.util.Scanner;

public class FirstPractice {
//    Given two int values, return their sum.
//    Unless the two values are the same,
//    then return double their sum.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Enter first number:");
        n1 = input.nextInt();
        System.out.println("Enter second number:");
        n2 = input.nextInt();

        //you can use methods with a return type (not void)
        //directly inside system.out to print the result of the method
        FirstPractice someVarName = new FirstPractice();
        System.out.println(someVarName.sum(n1,n2));
        System.out.println(sum1(n1,n2));

    }
    public int sum (int n1, int n2){
//        return (n1 + n2)* 2;//return statement is like a finishline.
        //when your code runs return statement
        //it means you want to break out of this method.
        if (n1 == n2){
           return (n1 + n2)* 2;
        }
            return n1 +n2;

    }
    public static int sum1 (int n1, int n2){
//        return (n1 + n2)* 2;//return statement is like a finishline.
        //when your code runs return statement
        //it means you want to break out of this method.
        if (n1 == n2){
            return (n1 + n2)* 2;
        }
        return n1 +n2;

    }

}

package com.java.class13.class13;

import java.util.Scanner;

public class InstanceMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 =sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        InstanceMethods2 var = new InstanceMethods2();

        System.out.println(var.digit(num1, num2));
        System.out.println("---------");
        System.out.println(lastDigit(num1,num2));

        System.out.println("----------");
        System.out.println("Enter also any number:");
        int num = sc.nextInt();
        System.out.println(threeOfFive(num));


        System.out.println("-----------");
        System.out.println("Please enter any two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        InstanceMethods2 varLast = new InstanceMethods2();
        System.out.println(varLast.isTen(a,b));




    }

//Given two non-negative int values,
    // return true if they have the same last digit,
    // such as with 27 and 57.
    // Note that the % “mod” operator computes remainders,
    // so 17 % 10 is 7.

    public static boolean digit(int num1, int num2){
        if (num1 >= 0 && num2 >= 0){

        }
        else {
            System.out.println("wrong input");
        }
        return  num1%10 == num2%10;
    }










    public static boolean lastDigit(int num1, int num2){
        if (num1 >= 0 && num2 >= 0){
            return num1%10 == num2%10;
        }
        return false;
    }


















//    create a method that takes a non-negative int.
//Return true if the given non-negative number is
// a multiple of 3 or a multiple of 5.
// Use the % “mod” operator
    public static boolean threeOfFive(int num){
        if (num < 0){
            System.out.println("The number should be nin-negative");
        }
        return  num % 3== 0 || num % 5== 00;
    }






//    Create a method that takes 2 integers,
//Given 2 ints, a and b, return true if one
// if them is 10 or if their sum is 10.
    public  boolean isTen( int a, int b){
        return a == 10 ||b == 10 || a + b ==10;

    }
}

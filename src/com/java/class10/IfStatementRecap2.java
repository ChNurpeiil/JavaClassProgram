package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap2 {
    public static void main(String[] args) {
        //1.Determining the minimum of three numbers;
        //ask the user to input 3
        //write a logic that will print out the largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("3 numbers");
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3) {

            System.out.println(num1 + " greatest number");

        } else if (num2>num1 && num2>num3) {

                System.out.println(num2 + " greatest number");
        } else {
            System.out.println(num3 + " greatest number");
        }


    }

}


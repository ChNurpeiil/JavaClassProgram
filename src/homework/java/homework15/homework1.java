package com.java.homework.homework15;

import java.util.Scanner;

public class homework1 {
    private static String operations;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your account opening balance: ");
        int balance = sc.nextInt();

       do {
           System.out.println("Please choose the operations you want to perform: \n1) Withdraw\n2)Deposit \n3)Check Balance ");
           String operations = sc.next();
           if (operations.equalsIgnoreCase("Withdraw") || operations.equalsIgnoreCase("1")) {
               System.out.println("Please enter the amount you want to withdraw: ");
               int withdraw = sc.nextInt();
               System.out.println("The available balance: " + balance);
           } else if (operations.equalsIgnoreCase("Deposit") ||operations.equalsIgnoreCase("2")) {
               System.out.println("Please enter the amount you want to deposit: ");
               int deposit = sc.nextInt();
               balance = balance + deposit;
               System.out.println("The available balance is: " +balance );

           } else if (operations.equalsIgnoreCase("Check Balance") ||operations.equalsIgnoreCase("3")) {
               System.out.println(operations = sc.next("The available balance is :" + balance));  
           }
           System.out.println("Do you want to perform more operations? Yes or No?");
           operations = sc.next();
       }while (operations.equalsIgnoreCase("yes "));


    }
}

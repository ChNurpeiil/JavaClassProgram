package com.java.class18;

import java.util.Scanner;

public class DoWhileLoop {


    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i >= 5);

        System.out.println("========");

        Scanner sc = new Scanner(System.in);
        String  choice;
        do {


            System.out.println("Please enter first number");
            int num1 = sc.nextInt();

            System.out.println("Please enter second number");
            int num2 = sc.nextInt();

            System.out.println("Please enter operation you want to perform ");
            String operation = sc.next();

            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Please enter valid operation");

            }
            System.out.println( "would you like to more operations? (Yes / No)");
            choice= sc.next();
        }   while (choice.equalsIgnoreCase("yes"));
    }
}

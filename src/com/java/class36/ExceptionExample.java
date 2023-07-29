package com.java.class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numbers[]= {2, 5, 7, 8};

        try {
            int num1 = input.nextInt(),num2 = input.nextInt();

            System.out.println(num1 / num2);
            System.out.println(numbers[4]);

        } catch (InputMismatchException e){
            System.out.println("Please try after hangover, enter numbers only");

        }catch (ArithmeticException e){
            System.out.println("Please study maths, we cannot divide witch zero ");
        }

        System.out.println("Welcome to the Party");
        System.out.println("Enjoy your dinner");
    }
    void  method1 (int a){

    }
}

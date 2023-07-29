package com.java.class18;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {



        int n = 1;
        while (n <= 50) {
            if (n % 3 == 0 || n % 5 == 0){

                System.out.println(n);
            }n++;
        }


        Scanner sc = new Scanner(System.in);


        String choice;

        do{
            System.out.println("Enter weight: ");
            int n1 = sc.nextInt();

            System.out.println("Enter length: ");
            int n2 = sc.nextInt();

            int result = n1 * n2;
            System.out.println( "Your squre is: " + result);

            System.out.println("Do you want more operations (Yes/No)");
            choice = sc.next();

        }while (choice.equalsIgnoreCase("Yes"));


    }

}

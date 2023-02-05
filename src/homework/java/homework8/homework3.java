package com.java.homework8;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how much you want to loan:");
        int loan = sc.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = sc.nextInt();
        if (loan < 10000 && creditScore < 600){
            System.out.println("Your interest rate is 15%.");
        } else if (loan> 10000 && creditScore > 600) {
            System.out.println("Your interest rate is 10%.");
        } else if (loan >= 10000 && creditScore < 600) {
            System.out.println("Your interest rate is 12%.");
        } else {
            System.out.println("Your interest rate is 8%.");
        }





    }
}

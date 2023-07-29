package com.java.class18;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Please enter your number: ");
            int  num = sc.nextInt();

            System.out.println(num*num);
            System.out.println("operation? (yes/ no)");
            choice= sc.next();
        }
        while (choice.equalsIgnoreCase("yes"));
    }
}

package com.java.class23;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String fruits[] = new String[8];

        System.out.println("Please enter 8 fruits");

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.next().trim();
        }

        System.out.println("Duplicate Fruts Are: ");
        for (int i = 0; i < fruits.length; i++) {
            for (int j = i + 1; i < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {

                    System.out.println(fruits[i]);
                }


            }
        }
    }
}
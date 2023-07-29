package com.java.class23;

import java.util.Scanner;

public class DuplicateElementFromArray {
    public static void main(String[] args) {
        String fruits[] = new String[8];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 8 fruits");

        for (int i = 0; i < fruits.length; i++){
            fruits[i] = sc.next().trim();

        }
        System.out.println("Duplicate Fruits are: ");

        for (int i = 0; i <fruits.length; i++){
            for (int j = i + 1; j < fruits.length; j++ ){

                if (fruits[i].equals(fruits[j])){
                    System.out.println(fruits[i]);

                    break;
                }

            }
        }
    }
}

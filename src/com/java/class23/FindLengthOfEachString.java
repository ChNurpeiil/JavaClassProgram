package com.java.class23;

import java.util.Scanner;

public class FindLengthOfEachString {
    public static void main(String[] args) {
       String names [] = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 5 String");

        for (int i = 0; i<names.length; i++){
           names[i] = sc.next();
        }
        for (int i =0; i < names.length; i++){
            System.out.println(names[i] +"=" + names[i].length());
        }


    }
}

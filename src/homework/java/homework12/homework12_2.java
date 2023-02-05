package com.java.homework.homework12;

import java.util.Scanner;

public class homework12_2 {
    public static void main(String[] args) {
      //Write a method that takes a string
        // returns a new string made of 3 copies of
        // the last 2 chars of the original string.
        // The string length will be at least 2.

        //extraEnd(“Hi”) → “HiHiHi”
        //extraEnd(“Hello”) → “lololo”
        //extraEnd(“ab”) → “ababab”

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str =sc.nextLine();
        System.out.println(last2chars(str));


    }
    public static String last2chars (String str){
        str = str.substring(str.length()-2, str.length());
        return str+str+str;
    }
}

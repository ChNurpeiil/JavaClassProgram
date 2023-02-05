package com.java.homework.homework21;

import java.util.Scanner;

//1. Write a program to count the number of vowels from the String (Ignoring Case)
//Example
//Input - Welcome to Java Class
//Output - Num of vowels=7
public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("Number of vowels: " + countVowels(str));

    }
    public static int countVowels(String str){
        int count =0;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='o'||str.charAt(i)=='i'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}

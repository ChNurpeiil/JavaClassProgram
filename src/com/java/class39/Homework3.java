package com.java.class39;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Task 3: Write a program to print unique
// words from the Given String
//Example:
//Input - well, collection is very easiest topic in java and it is very useful as well
//Output - collection easiest topic in java and it useful as well
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String>words = new HashSet<>();

        //Take data from user
        System.out.println("Enter any String");
        String str = sc.nextLine();

        String[] listOfWords = str.split(" ");

        for (int i = 0; i < listOfWords.length; i++){
          //  System.out.println(listOfWords);
            words.add(listOfWords[i]);
        }
        System.out.println(words);
    }
}

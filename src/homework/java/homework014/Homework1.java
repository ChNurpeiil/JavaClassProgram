package homework.java.homework014;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Homework 1:
        //Write a method that takes a string and
        // returns true if the string starts with “hi” and
        // false otherwise.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word : ");
        String words =sc.nextLine();
        System.out.println(" star with \"hi\" - " + starWithHi(words)  );


        String str78 = "I love waking at 5am bc my day ultra productive";
        System.out.println(str78.indexOf("5am"));

    }
    public static boolean starWithHi(String words){

        return words.startsWith("hi");
    }

}

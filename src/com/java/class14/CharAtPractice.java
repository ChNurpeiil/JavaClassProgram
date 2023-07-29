package com.java.class14;

import java.util.Scanner;

public class CharAtPractice {
    public static void main(String[] args) {
        //create a method that takes a String and return the last character
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the String :");
        String  str = sc.nextLine();

        CharAt charAt = new CharAt();
        System.out.println(lastChar(str));


    }

    public static char lastChar(String str){


        return str.charAt(str.length()-1);//4-1 =3
    }
}

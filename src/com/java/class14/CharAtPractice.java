package com.java.homework14;

import java.util.Scanner;

public class CharAtPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the String :");
        String  str = sc.nextLine();

        CharAt charAt = new CharAt();
        System.out.println(lastChar(str));

    }
    public static char lastChar(String str){
        return str.charAt(str.length()-1);
    }
}

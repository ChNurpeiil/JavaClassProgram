package com.java.homework.homework12;

import java.util.Scanner;

public class homework12_3 {
    public static void main(String[] args) {
//  Given a string of any length, return a new
//  string where the last 2 chars, if present,
//  are swapped, so “coding” yields “codign”.

//lastTwo(“coding”) → “codign”
//lastTwo(“cat”) → “cta”
//lastTwo(“ab”) → “ba”
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any words : ");
        String str = sc.nextLine();
        System.out.println(swapLast2Char(str));
    }
    public static String swapLast2Char(String str){
        String words = str.substring(0 , str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        return words;
    }
}

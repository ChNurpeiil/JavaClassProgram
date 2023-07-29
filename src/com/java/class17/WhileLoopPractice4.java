package com.java.class17;

import java.security.SecureRandom;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        //write program that print out
        //every other character of a String

        //ex:Java
        //a a
        //Hello
        //e l
        //World
        //o l
        //Mission Impossible
        //i s o m o s i l
//        String str = "Hello";
//        int i = 1;
//        while (i < str.length() ){
//
//            char newChar =str.charAt(1+ i++);
//            i++;
//
//            System.out.println(newChar);
//        }
        System.out.println("xxxxxxxxxxxx");
        String str5 = "Hello World from Mars";
        int a =1;

        while (a < str5.length()){
            char newChar = str5.charAt(a);
            System.out.println(newChar);
            a+=2;
        }
    }
}

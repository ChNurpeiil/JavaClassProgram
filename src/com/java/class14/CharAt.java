package com.java.homework14;

public class CharAt {
    //charAt(int i ) --> return  a character at ith index
    //hard coding means ==>
    public static void main(String[] args) {
        String str = "wedevx.co";
        System.out.println(str.charAt(1));//e
        System.out.println(str.charAt(0));//w
        System.out.println(str.charAt(5));//w
        System.out.println(str.charAt(6));//.

        String str2 = "hello World";
        System.out.println(str2.charAt(5)); //space

        String str3 = "Superstar";
        System.out.println(str3.charAt(8));// index out of bound
        //Exception are runtime errors
        //StringIndexOutOfBoundsException




    }
    //create a method that takes a String and return the last character
}

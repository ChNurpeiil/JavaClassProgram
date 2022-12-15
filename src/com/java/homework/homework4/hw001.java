package com.java.homework.homework4;

public class hw001 {
    public static void main(String[] args) {
        //Login Functionality
//Write a logic which would tell the user if logged in or not
//you have a username
//you have a password
//you loginLocation

//in order to be logged your userName should match steve@apple.com
//and your password should be infinityLoop1
//and you location should be california
        String username = "zhanna@.com";
        String password = "infinityLoop1";
        String loginLocation = "california";

        boolean Login = username == "steve@apple.com" || password =="infinityLoop1"|| loginLocation =="california";
        System.out.println(Login);
    }
}

package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {
        //Write a program
        //that will print out
        //*
        //**
        //***
        //****
        //*****
        String x = "*";
        while (x.length()<6 ){

            System.out.println(x);
            x += "*";
        }
        System.out.println("----------");


        String str = "*";
        int iterator = 0;
        while (iterator < 5){
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        }

        System.out.println("========");


        String  str2 = "";
        while (str2.length() < 5){
            //you must have a statement
            //that updates the value of a variable that
            //is used in boolean expression
            str2 = str2.concat("*");
            System.out.println(str2);
        //    iterator++;

        }

        System.out.println("////////////");

        //write a program
        //that print out
        //10-0
        //9
        //8
        //7
        //6
        //5
        //4
        //3
        //2
        //1
        //0
        System.out.println("xxxxxxxxxxxxxxxxxx");
        int num = 10;
        while (num >= 0){
            System.out.println(num);
            num--;
        }


        System.out.println("xxxxxxxxxxxx");

        int number = 10;
        while (number >= 0){
            System.out.println(number);
            number--;
        }








        //write a program that prints out
        //*****
        //****
        //***
        //**
        //*
        System.out.println("##########");

        //how to print 1 less character in a String? -> substring
        //substring (0, str.length()-4)
        String str6 = "*****";

        while (str6.length() > 0){
            System.out.println(str6);
            str6 = str6.substring(0,str6.length()-1);

        }

        System.out.println("#########");







    }


}

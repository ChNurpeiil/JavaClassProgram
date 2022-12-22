package com.java.class07;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
//    if (false){
//        System.out.println("I am Nurpeiil");
//
//    }
//        System.out.println("I am not Nurpeiil");
//
//
//    int gallon0fOil = 400;
//    if (gallon0fOil < 1000){ //true
//        System.out.println("Hello World");
//    }
//


        Scanner sc = new Scanner(System.in);
        System.out.println(" your age");

        int age = sc.nextInt();
        System.out.println(age);

        if (age > 18){
            System.out.println("You can married");
        }else
            System.out.println("you don't married");
    }
}

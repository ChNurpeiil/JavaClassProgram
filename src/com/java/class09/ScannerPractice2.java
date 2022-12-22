package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender? M or F ");

        //
        char gender = sc.next().charAt(0);
        if (gender== 'M' || gender =='m'){
            System.out.println("go work hard");
        }
        else if (gender == 'F' || gender == 'f'){
            System.out.println("Enjoy your life");
        }
        else {
            System.out.println("Wrong input");
        }



    }
}

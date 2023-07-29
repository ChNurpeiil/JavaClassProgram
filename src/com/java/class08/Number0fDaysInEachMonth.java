package com.java.class08;

import java.util.Scanner;

public class Number0fDaysInEachMonth {
    //Write a program to take a month number from the user
    //and print the number of number of days a given month

    //if user enter a number outside of 1 and 12 out
    //wrong entry. You can only input a number between 1 and 12. Please try again

    //ex 1:
    //Please enter the month in number
    //input:1
    //output: 31

    //ex 2:
    //Please enter the month in number
    //input:6
    //output: 30

    //ex 3:
    //Please enter the month in number
    //input:2
    //output: 28 or 29


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month in number");
        int monthNumber = input.nextInt();
        if (monthNumber == 1 ||monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber ==10 || monthNumber == 12){
            System.out.println("31");
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber== 9 ||monthNumber==11) {
            System.out.println("30");
        }else  if (monthNumber == 2) {
            System.out.println("28 or 29");

            // not always, but usually else is used to handle error messages
        }else
            System.out.println("wrong entry. You can only input a number between 1 and 12. Please try again");
    }
}

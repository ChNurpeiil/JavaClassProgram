package com.java.class08;

import java.util.Scanner;

public class CreaterSalaryIfElsePractice {
    public static void main(String[] args) {
        /*Write a program to get the salaries of two-person
        and print the name of the person that has a greater salary
         * Question Type: Write Code.
     * Test Data:
     * Example 1
     * Person 1: 1200
     * Person 2: 2500
     * Output: 2500

     * Example 2:
     *  Person 1: 4500
     *  Person 2: 8600
     * Output: 8600

         */
        System.out.println("Write your salary: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Aman salary");
        int person1 =  input.nextInt();
        System.out.println("Alfiyat salary");
        int person2 = input.nextInt();
        if (person1 > person2){
            System.out.println(person1);
        }else {
            System.out.println(person2);
        }


    }
}

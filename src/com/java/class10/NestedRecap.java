package com.java.class10;

import java.util.Scanner;

public class NestedRecap {
    public static void main(String[] args) {


        /*let's design the logic for restaraunt app
        first users should be given 2 options:
        appetizer or main course
        if user picks appeterzer.
        we should show user 2 appetirezer.
1: spring rolls
2: egg rolls
once user is shown appetizer options they should be able select one
appetizer.
if user selects spring roll: print out spring roll ingredients
if user selects egg roll: print out egg roll ingredients

if user picks main course
show
1. Lagman
2. New York Rib Eye steak
if user selects Lagman: print out Lagman  ingredients
if user selects New York Rib Eye steak: print out New York Rib Eye steak ingredients
         */

        System.out.println("1. Main Course");
        System.out.println("2.Appetizer");

        Scanner sc = new Scanner(System.in);

        String choice1 = sc.nextLine();

        //how  do we compare Strings?
        if(choice1.equalsIgnoreCase("Main course") || choice1.equals("1")) {
            System.out.println("1. Lagman");
            System.out.println("2.NYC S teak");

            String choiceMainCourse = sc.nextLine();

            if (choiceMainCourse.equalsIgnoreCase("Lagman") || choiceMainCourse.equals("1")){
                System.out.println("Lagman Ingredients");
            } else if (choiceMainCourse.equalsIgnoreCase("NYC Steak") || choiceMainCourse.equals("2")) {
                System.out.println("NYC Steak Ingredients");
            }


        } else if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg rolls");
            String choiceAppetizer = sc.nextLine();

            if (choiceAppetizer.equalsIgnoreCase("Spring rolls") || choiceAppetizer.equals("1")){
                System.out.println("Spring Roll Ingredients");
        } else if (choiceAppetizer.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
                
            }

        }
}
}

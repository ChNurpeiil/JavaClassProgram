package com.java.class22;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        // Create and initialize an array
        int listOfData[] = {10,30,50,30,70,40,45,32};

        //Access element from the array
        System.out.println(listOfData[2]);

        System.out.println(listOfData.length);

        for (int i= 0; i < listOfData.length; i++){
            System.out.println(listOfData[i]);
        }

//        System.out.println(listOfData[0]);
//        System.out.println(listOfData[1]);
//        System.out.println(listOfData[2]);
//        System.out.println(listOfData[3]);
//        System.out.println(listOfData[4]);
//        System.out.println(listOfData[5]);


        System.out.println(listOfData);// Memory Address

        System.out.println(Arrays.toString(listOfData)); //Data

        System.out.println(listOfData[6]);

        //Declaring of array
        int data[] = new int[8] ;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 number");
        // Getting the number from user
        for (int i=0; i <listOfData.length; i ++){
            listOfData[i] = input.nextInt();
        }
        System.out.println("Please enter target number we need find index");
        int targetNumber = input.nextInt();

        for (int i =0; i< listOfData.length; i++){
            if (listOfData[i] == targetNumber){
                System.out.println(i);
            }
        }
    }
}

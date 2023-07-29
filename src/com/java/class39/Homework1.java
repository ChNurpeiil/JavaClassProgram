package com.java.class39;

import javafx.scene.transform.Scale;

import java.util.*;


//write a program to get five numbers from the user and sort them in ascer
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>numbers = new ArrayList<>();

        //Take data from user
        System.out.println("Enter five numbers");
        for (int i = 0; i <5; i++){
           numbers.add(sc.nextInt());
        }

        //Sort the data and print
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

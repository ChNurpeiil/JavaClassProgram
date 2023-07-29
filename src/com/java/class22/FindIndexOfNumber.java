package com.java.class22;

import java.util.Scanner;

public class FindIndexOfNumber {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);

         int listOfData[]= {10, 30, 50, 30, 70, 40, 45, 32};

         int targetNumber = 70;

         for (int i = 0; i < listOfData.length; i++){
             if (listOfData[i] == targetNumber){
                 System.out.println(i);
             }
         }
    }
}




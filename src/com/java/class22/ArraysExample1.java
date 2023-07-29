package com.java.class22;

import java.util.Arrays;

public class ArraysExample1 {
    public static void main(String[] args) {
        //Create and initialize array
        int listOfData [] ={ 10, 30, 50, 30, 70, 40, 45, 32};

        // Access element from the array
        System.out.println(listOfData [2]);
        System.out.println("=======");
        System.out.println(listOfData.length);

        System.out.println("-------");

        for (int i = 0; i < listOfData.length; i++) {
            System.out.println(listOfData[i]);
        }
        System.out.println("xxxxxxxxxxxxx");
        System.out.println(listOfData [0]);
        System.out.println(listOfData [1]);
        System.out.println(listOfData [2]);
        System.out.println(listOfData [3]);
        System.out.println(listOfData [4]);
        System.out.println(listOfData [5]);
        System.out.println(listOfData [6]);
        System.out.println(listOfData [7]);

        System.out.println("#########");

        System.out.println(listOfData);// Memory Address/ location

        System.out.println(Arrays.toString(listOfData));//Data
        System.out.println(listOfData[7]);
    }
}

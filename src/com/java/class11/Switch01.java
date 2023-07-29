package com.java.class11;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {


//        Input - 1,  Output - 31 days
//        Input - 2,  Output - 28/29 days
//        Input - 3,  Output - 31 days
//        Input - 4,  Output - 30 days
//        Input - 5,  Output - 31 days
//        Input - 6,  Output - 30 days
//        Input - 7,  Output - 31 days
//        Input - 8,  Output - 31 days
//        Input - 9,  Output - 30 days
//        Input - 10,  Output - 31 days
//        Input - 11,  Output - 30 days
//        Input - 12, Output - 31 days


        System.out.println( " Number mounth");
        int rate = 4;
        switch (rate){

            case 2:
                System.out.println("28/29 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:

        }
    }
}

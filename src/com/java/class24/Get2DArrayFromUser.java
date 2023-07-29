package com.java.class24;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
//Get 2D array from user and print greatest number from each row
public class Get2DArrayFromUser {
    public static void main(String[] args) {
        int data[][]= new int[3][3];

        Scanner input = new Scanner(System.in);

        for (int i=0; i< data.length; i++){
            System.out.println("Enter 3 number for row" + (i +1));

            for (int j = 0; j< data[i].length; j++){
                data[i][j]= input.nextInt();
            }

        }

    }
}

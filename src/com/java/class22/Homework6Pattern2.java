package com.java.class22;

import java.util.Scanner;

public class Homework6Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = input.nextInt();




        for (int i =1; i<=num-1;i++){
            for (int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i *2 - 1; j++ ){

                System.out.print("*");
            }
            System.out.println();

        }


        for (int i =num; i>=1; i--){

            for (int k = 1; k <= num - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2 * i - 1; j++ ){

                System.out.print("*");
            }
            System.out.println();

        }
    }
}

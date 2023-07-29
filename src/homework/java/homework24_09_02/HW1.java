package homework.java.homework24_09_02;

import java.util.Scanner;

//1. Write a program to get two 2D arrays from the user and print the sum of it
//Input:
//Array 1
//1 1 1
//2 2 2
//3 3 3
//Array 2
//4 4 4
//2 2 2
//1 1 1
//
//Output:
//5 5 5
//4 4 4
//4 4 4
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data1[][] = new int[3][3];
        int data2[][] = new int[3][3];
        int data3[][]= new int[3][3];

        for (int i = 0; i < data1.length; i++) {
            System.out.println("Enter  (first  2D Array) 3 number for row" + (i + 1));
            for (int j = 0; j < data1.length; j++) {
                data1[i][j] = sc.nextInt();
            }
        }for (int i = 0; i < data2.length; i++) {
            System.out.println("Enter  (first  2D Array) 3 number for row" + (i + 1));
            for (int j = 0; j < data2.length; j++) {
                data2[i][j] = sc.nextInt();
            }
        }for (int i = 0; i < data1.length; i++){
            System.out.println("Sum  of two 2D array is " + (i +1));
            for (int j = 0; j <data1.length; j++ ){
                data3[i][j] = data1[i][j]+ data2[i][j];
                System.out.println(data3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

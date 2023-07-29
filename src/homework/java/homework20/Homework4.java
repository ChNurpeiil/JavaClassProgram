package homework.java.homework20;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
// Write a program to print the greatest digit from the given number
//Example1
//Input - 86545
//Output - Greatest digit is 8
//Example2
//Input - 23561
//Output - Greatest digit is 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int i = sc.nextInt();
        int j = 1;

        while (i > 10){
            if (i % 10 > j){
                j = i % 10;
            }
            i = i / 10;
        }
        System.out.println("Greatest digit is " + j);
    }
}

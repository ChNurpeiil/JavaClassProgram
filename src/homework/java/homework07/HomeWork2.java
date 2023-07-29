package homework.java.homework07;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        2. Write a Java program that takes
        three positive integer numbers from the
        user as input to calculate and output
         the average of those three numbers.
        ex:
        Input 1: 5
        Input 2: 10
        Input 3: 15
        Output: 10
        Input 1: 23
        Input 2: 24
        Input 3: 25
        Output: 24
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int first = sc.nextInt();

        System.out.println("Please enter second number:");
        int second = sc.nextInt();

        System.out.println("Please enter third number");
        int third = sc.nextInt();

        int result = (first + second + third)/3;
        System.out.println("Your average : " + result);





    }
}

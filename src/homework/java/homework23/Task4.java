package homework.java.homework23;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
//    4. Write a program to sort array elements
//    in ascending order
//Input: 5 2 8 7 1
//Output: 1 2 5 7 8

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        System.out.println("Enter 5 number");

        for (int i = 0; i < 5; i++){
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}

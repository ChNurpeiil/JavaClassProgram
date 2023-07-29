package homework.java.homework23;

import java.util.Scanner;

//2.
// Write a program to find
// the duplicate elements from the array
// (The element should not be repeated in the output ) -
// Brainstorm to find the logic
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//Output: 45, 65, 85
public class Task2 {
    public static void main(String[] args) {
        int number[] = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter 10 numbers: ");


        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();

        }
        System.out.println("Duplicate number is :");
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {

                if (number[i] == (number[j])) {
                    System.out.println(number[i]);

                    break;
                }
            }


//        for (int i = 0; i < number.length; i++){
//            number[i]= sc.nextInt();
//        }
//        System.out.print("Duplicate Fruits are: ");
//
//        for (int i = 0; i <number.length; i++){
//            for (int j = i + 1; j < number.length; j++ ){
//
//                if (number[i]==(number[j])){
//                    System.out.println(number[i]);
//
//                    break;
//                }
//
//            }
//        }

        }
    }}

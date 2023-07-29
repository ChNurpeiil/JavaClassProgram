package homework.java.homework22;

import java.util.Scanner;

//Write a program to find the sum of even and odd numbers
//Example
//Input - 12, 45, 67, 23, 13, 45, 56
//Output - Sum of Even Elements - 68,
// Sum of Odd Elements - 193
public class Homework2 {
    public static void main(String[] args) {
        // int listOfData[] = {12, 45, 67, 23, 13, 45, 56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 number");

        int listOfNumbers[] = new int[7];
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println(listOfNumbers.length);


        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = sc.nextInt();
        }
        for (int i = 0; i < listOfNumbers.length; i++) {

            if (listOfNumbers[i] % 2 == 0) {
                sumOdd = sumOdd + listOfNumbers[i];

            } else {
                sumEven = sumEven + listOfNumbers[i];

            }

        }
        System.out.println("Sum even"+sumEven);
        System.out.println("Sum Odd"+sumOdd);





    }


}


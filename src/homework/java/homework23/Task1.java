package homework.java.homework23;

import java.util.Scanner;

//1.
// Write a program to get a collection
// of elements and print it in reverse order
//Input: 1 2 3 4 5
//Output: 5 4 3 2 1
public class Task1 {
    public static void main(String[] args) {
        int collectionOfElements [] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 5 number: ");
        for ( int i = 0; i < collectionOfElements.length ; i++){
            collectionOfElements[i] = sc.nextInt();

        }
        System.out.println("Reverse order: ");
        for ( int i= collectionOfElements.length - 1; i>=0; i-- ){
            System.out.print(collectionOfElements[i] + " ");
        }

        System.out.println();

    }
}

package homework.java.homework019;

import java.util.Scanner;

public class Homework2 {
    //    2. Write a program to count the number of divisors
//    of the given numbers
//For example - Number 6 has 4 divisors & 12 has 6 divisors
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        int count = 0;
        for (int i = 2; i < num; i++){
            if (num % i ==0){
                count++;

            }
        }
        if (count ==0){
            System.out.println("Prime");
        }else {
            System.out.println("not Prime");
        }
        System.out.println("divisors: " + count);


    }
}

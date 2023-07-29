package com.java.class20;

import java.util.Scanner;

//Any number that are divisible by 1 and itself called prime number
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        boolean isPrime = true;
        int count = 0;
        for (int i = 2; i < num; i++){
            if (num % i ==0){
                isPrime = false;

            }
        }
        if (isPrime == true){
            System.out.println("Prime");
        }else {
            System.out.println("not Prime");
        }
        System.out.println("divisors: " + count);



    }
}

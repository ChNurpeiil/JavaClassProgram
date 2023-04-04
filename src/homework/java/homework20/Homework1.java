package com.java.homework.homework20;

public class homework1 {
//  Write a program to find
//  sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 5; i++){
       sum = sum + (int) Math.pow(i, i);

    }
    System.out.println(sum);
}
}

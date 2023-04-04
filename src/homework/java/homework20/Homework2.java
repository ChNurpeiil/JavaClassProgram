package com.java.homework.homework20;

public class homework2 {
// Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
//Note - Please print the sum in decimal, answer should not be zero
public static void main(String[] args) {
double sum = 0;
for (double i = 1; i <= 10; i++){
    sum += i / (i+1);
}
    System.out.println(sum);
}
}

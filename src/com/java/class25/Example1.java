package com.java.class25;

public class Example1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j =1; j<4; j++){
                i = i % j;
                System.out.println(j);
            }
        }
    }
}

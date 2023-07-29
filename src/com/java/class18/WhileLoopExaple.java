package com.java.class18;

public class WhileLoopExaple {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10){

            if (i % 3 ==0){
                i=i+2;
            }
            i++;
            System.out.println(i);
        }
        System.out.println();

        int b =1;
        while (b<= 10){
            System.out.println(b);
            if (b % 3==0){
                i--;
            } else if (b % 2 ==0) {
                b = b +2;

            }else {
                b++;
            }
            b=b+2;
        }
        System.out.println("======");
    }
}

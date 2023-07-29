package com.java.class37;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        System.out.println("Hello");
//        Thread.sleep(5000);
//        System.out.println("How are you?");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("How are you?");
    }
}

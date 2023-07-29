package com.java.class25;

public class HW {
    public static void main(String[] args) {
        String str1 = "Hello", str2 = "Java";
        int i = 10, j = 20;

        System.out.println(i+j);//30
        System.out.println("i+J");//(1020)=           //i+j
        System.out.println(str1+i);//Hello10
        System.out.println(str1+i+j);//(Hello30)       //Hello1020
        System.out.println(i+j+str1);//30Hello
        System.out.println(str1+i*j);//Hello200
//        System.out.println(str1+i-j);//error
        System.out.println(str1+i+j+str2);//Hello30Java    //Hello1020Java


    }
}

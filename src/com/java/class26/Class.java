package com.java.class26;

public class Class {

    int temperature =8;
    String str1;

    Class(){
        System.out.println("First Constructor");
    }
    Class(int howtemperature, String str2){

    temperature= howtemperature;
    str1=str2;
        System.out.println("Today is the "+str2+" rainy, temperature : "+howtemperature+" celsius");
    }
    void Class(){
        System.out.println("From Method");
    }
    public static void main(String[] args) {
        Class c = new Class(8,"weather");
        Class class1 = new Class();
        class1.Class();
    }
}

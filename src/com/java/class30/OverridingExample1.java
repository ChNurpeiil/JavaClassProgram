package com.java.class30;
class Bank1 {
    void displayRateOfInterest(){
        System.out.println("6.0 %");
    }
    void withdraw(int amount){

    }
    void deposit(int amount){

    }
}

class OptimaBank extends Bank1{
    @Override
    void displayRateOfInterest(){
        System.out.println("8.0 %");
    }
}
class KISBBank extends Bank1{
    @Override
    void displayRateOfInterest(){
        System.out.println("7.0 %");
    }
}

public class OverridingExample1 {
    public static void main(String[] args) {
        OptimaBank ob = new OptimaBank();
        KISBBank kb = new KISBBank();
        ob.displayRateOfInterest();
        kb.displayRateOfInterest();
    }
}

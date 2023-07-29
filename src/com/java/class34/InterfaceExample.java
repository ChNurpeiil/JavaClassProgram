package com.java.class34;

interface Bank{

    public static final int num = 10;

    void displayRaterOfInterest();

    void withdraw(int amount);

    void deposit(int amount);
}

interface InternationalBank extends Bank{
    void displayRateOfInterest();
}

class CitiBank implements InternationalBank{

    @Override
    public void displayRaterOfInterest(){

    }

    @Override
    public void withdraw(int amount){

    }

    @Override
    public void deposit(int amount){

    }

    @Override
    public void displayRateOfInterest() {

    }
}

class  ChaseBank implements Bank{

    @Override
    public void displayRaterOfInterest(){

    }

    @Override
    public void withdraw(int amount){

    }

    @Override
    public void deposit(int amount){

    }
}


public class InterfaceExample {
    public static void main(String[] args) {

    }
}

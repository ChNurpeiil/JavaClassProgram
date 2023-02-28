package com.java.class31;

class Bank{
    void withdraw(){

    }
    void deposit(){

    }
    void displayRaterOfInterest(){

    }
}

class ChaseBank extends Bank{
@Override
    void displayRaterOfInterest(){
    System.out.println("Child rate of interest");

}
void takeQuickloan(){
    System.out.println("Child Take quick loan");
    }
}
public class DynamicTotallymorphismRealTimeExample {
}

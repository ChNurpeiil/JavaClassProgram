package com.java.class27;

public class BankNew {
    double balance;
    String accName;
    String accNumber;


    // Parametrized constructor
    BankNew(String accNameFromUser, String accNumFromUser) {
        balance = 0;
        accName = accNameFromUser;
        accNumber = accNumFromUser;
    }


    void deposit(int amount) {
        System.out.printf(accName + " is trying to deposit " + amount + " into " + accNumber);
        balance = balance + amount;
    }

    void withdraw(int amount) {
        System.out.printf(accName + " is trying withdraw " + amount + " from " + accNumber);
        balance = balance - amount;
    }
}
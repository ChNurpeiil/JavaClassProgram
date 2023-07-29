package com.java.class26;

import java.util.Scanner;

public class BankMainClass {

    public static void main(String[] args) {


        Bank acc2 = new Bank();

        Bank acc1 = new Bank("Chirag", "12345");
        acc1.deposit(1000);

        Bank acc3 = new Bank("Devx","5000");
        acc3.withdraw(588);



    }
}
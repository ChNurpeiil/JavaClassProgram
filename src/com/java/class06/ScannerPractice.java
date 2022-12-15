package com.java.class06;

//must have to be able to use Scanner

//
import java.util.Scanner;

public class ScannerPractice {
    //compliling a code ==>checking if we are matching all syntax rulex
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input.nextInt()--> will enable us to input and int data to our
        //program
        //it will allow us to enter an integer
        input.nextInt();


//        //user
//        input.nextLine();
//        //
        //I can also input int value which will be converted to a double//       input.nextDouble();
//        //
//        input.nextBoolean();
        // 127 is max value you can input
        input.nextByte();
    }
}

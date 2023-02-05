package com.java.class113;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringPractice {
    public static void main(String[] args) {
        //
        //
        String str = "Hello";
        String str2 = "DevX";
        //
        //
        //
        String str3 = str + str2;
        System.out.println(str3);

        String str4 = str + " "+ str2;
        System.out.println(str4);

        int a = 10;
        int b = 15;

        int sum = a + b;
        System.out.println(sum);

        String str5 = "10";
        String str6 = "15";
        String str7 = str5 +str6;
        System.out.println(str7);

        // when concatenating a String with different data types
        //everything turns ( casts) into a String.
        String str8 = a + str5;
        System.out.println(str8);

        String str9 = 42 + 10 + "DevX";
        System.out.println(str9);

        String str10 = "Hello" + 42 + 10 + "DevX";
        System.out.println(str10);


    }
}

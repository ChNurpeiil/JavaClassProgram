package com.java.class04;

public class ExpressionExample {
    public static void main(String[] args) {
        System.out.println(15 / 3 *5);
        System.out.println(3 * 5 / 15);
        System.out.println(3 * 5 / 15 * 10 / 2 / 2 );
        System.out.println(10 - 5 * 2 / 10 + 6 * 3 - 16 * 2);
        // 10 - 1+ 18 -32
        System.out.println((10 - 5) * (2 / 10) + 6 * 3 - 16 * (2 + 2));
        //((10 - 5) * (2 / 10) + 6 * 3 - 16 * (2 + 2))
        // 5*0+6*3-16*(2+2)
        // 5*0+6*3-16*4
        //0+18-64
        //18-64
        //-46

    }
}

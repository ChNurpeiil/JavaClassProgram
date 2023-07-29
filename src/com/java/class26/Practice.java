package com.java.class26;

public class Practice {
    public static void main(String[] args) {
        int a = 35, b = 9, c = 3;
        int result = a % b % c;
        System.out.println(result);

        int a1 = 35, b1 = 9, c1 = 3;
        int result1 =a1 + b1 % c1 * a1 / b1 + c1 + b1 / c1;//a1 +( b1 % c1 * a1 / b1 )+ c1 +( b1 / c1 )
        System.out.println(result1);                         // a1+ 0+c1+3+= 35 +0+3+3
                                                               //41

    }
}

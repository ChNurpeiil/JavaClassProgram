package com.java.class15;

public class indexOfSubstingPractice {
    public static void main(String[] args) {
        String str = "I love 5am waking up at ";
        //check for the length of this String.
        //3
        int length = "5am".length();
        int length1 = "up".length();
        int indexOfUp= str.indexOf("up");
        int indexOf5am = str.indexOf("5am");
        System.out.println(str.substring(indexOf5am, indexOf5am+ length));
        System.out.println(str.substring(indexOfUp,indexOfUp+ length1));
    }
}

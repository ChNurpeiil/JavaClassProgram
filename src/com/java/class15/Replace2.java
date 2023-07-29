package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {

        //Write a program that updates the first e in the second word
        //to X
        String  str = "DevX Adventures World";//=>DevX AdvXntures World
//               String str = "Hello Coder superstar"; //=> Hello CodXr superstar
//               String str ="I went to College"; //=> I wXnt to College
        int indexOfFirstSpace = str.indexOf(" ");
        //AdvXntures World
        System.out.println(str.substring(indexOfFirstSpace).replaceFirst("e","X"));
        //DevX
        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e","X");

        String devXOnly = str.substring(0, indexOfFirstSpace);
        String finalResult = devXOnly.concat(noDevXEReplaced);
        System.out.println(finalResult);


    }
}

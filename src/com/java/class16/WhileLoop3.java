package com.java.class16;

public class WhileLoop3 {
    public static void main(String[] args) {


        //how to print 1 less character in a String? -> substring
        //substring(0, str.length()-3)
//        String str10 = "*****";
//
//
//        while (str10.length() > 0){
//            str10.substring(0,str10.length()-1);
//        }




        //write a program that will
        //print out even number until 20
        //2-4-6-8-10-12-14-16-18-20



        int number = 0;
        while (number <= 20){
            System.out.println(number);
            number+=2;
        }

        System.out.println("=======");

        //space complexity =>
        //time complexity =>
        //big annotation =>


         int num = 0;
        while (num <= 20){
            num =num + 2;
            System.out.println(num);

        }

        System.out.println("---------");
        int num1 = 0;
        while (num1<=20){
            if (num1%2 == 0){
                System.out.println(num1);
            }
            num1++;
        }
        System.out.println("/////////");

        //write a program
        //that will count number of vowel characters
        //and consonant characters in a String

        //String str = "Hello DevXer";
        //4 - VOWELS
        //8 - consonants including the spase




        String a = "Hello DevXer";
        int b = 0;
        int c =0;
        while (b<a.length()){
            if (a.charAt(b)== 'e' || a.charAt(b)=='o'){
                System.out.println("It's vowel " + b++);
            }b++;


        }

    }
}

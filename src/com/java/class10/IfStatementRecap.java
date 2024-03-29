package com.java.class10;

import java.util.Scanner;
//coding interview process:
//1. CLARIFY GAPS in the requirement by asking questions
//2.write a pseudocode
//3. write the code
//4. debug your code -> checking your code for mistakes


public class IfStatementRecap {
    public static void main(String[] args) {
        //1.Determining the minimum of three numbers;
        //ask the user to input 3
        //write a logic that will print out the largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

//        if(n1<n2 || n1<n3) {
//            System.out.println(n1 + "is the greatest");
//        } else if (n2>n1 || n3>n2) {
//            System.out.println(n2 + "is the greatest");
//
//        }
//        else {
//            System.out.println(n3 + "is the greatest");
//        }
//        //
        //first step : before we jump to pseudocode - we need to clarify any missing requirements:
        //can all numbers be equal? If yes what should be the output
        //->yes , printout all numbers are equal


        //what if 2 numbers are largest and equal?-> print out that number
        //is there a limit for numbers? no
        //are these only whole numbers? or decimal pointed number - whole numbers
        //can we compare negative numbers? - yes


        //pseudocode -> is a the logic of a program
        //written in plain english.
        //I need to 3 integer numbers
        //My logic would like this
        //I need to tackle  the numbers 1 by 1.
        //first let's write a logic where my n1 is the largest
        //my n1 would the largest if it's bigger than n2 AND bigger than n3
        //so this is true then print out  n1  is the  largest number
        //if num1 is equal to num2 and greater than num3
        //then print out n1 and n2 are the greater number
        //if num1==num2 && num1 > num3 sout n1 and n2 are their greatest
        if (n1 >= n2 && n1 >n3){
            System.out.println(n1+"is the largest number");
        }


        //now I need check if the n2 is the largest
        //n2 is the largest if it's larger than n1 and largest than n3
        else if (n2 > n1 && n2 >n3){
            System.out.println(n2+"is the largest number");
        }
        //lastly I need check if n3 is the largest
        //n3 is the largest if n3 is larger than n2 and n3.
        else if (n3 > n1 && n3 >n2){
            System.out.println(n3+"is the largest number");
        }
        // if all numbers are equal printOut"equal number"
        else if (n3== n1 && n3==n2){
            System.out.println("All numbers are equal");
        }

        else if (n1==n2 && n1>n3) {
            System.out.println(n1+"is the largest number");
        }



        //general rule for debugging:
        //if you have the same exact body for multiple if statements it's bad
        //you can optimize your code by combining logics into one if statement









//           if (n1 > n2 && n1> n3){
//            System.out.println(n1 +"is the largest number");
//        } else if (n2> n1 && n2 > n3) {
//            System.out.println(n2 +"is the largest number");
//        } else if (n3 > n1 && n3 > n2) {
//            System.out.println(n3 +"is the largest number");
//        } else if (n3 == n1 && n3 ==n2) {
//            System.out.println("All numbers are equal");
//        } else if (n1 == n2 && n1>n3) {
//            System.out.println(n1 + "");
//        }
        // if all numbers are equal printOut"equal numbers"
    }
}

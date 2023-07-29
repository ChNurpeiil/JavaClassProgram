package com.java.class17;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        //write a program to print out all character in a String
        String  str = "Let's go Mars";
        //do I know how times my loop should be iterated

        int startingIndex = 0;

        //if you need to increment then use
        // var < how many times you need to run
        while (startingIndex < 13){
            char eachChar = str.charAt(startingIndex);
            System.out.println(eachChar);
            startingIndex++;
        }
        //1.define the right starting point
        //2.define a boolean  expression where
        //you are using the variable of starting point
        //3.write body of the while loop.
        //4. make sure you have an updater  of a variable in the boolean expression


        //write a program that print the all characters of a String
        //in reverse order
        //ex: Java
        //avaJ
        //Lambo -> obmal
        //obama -> amabo
        //DevX -> XveD
        System.out.println();
        String java ="Java";
        int startIndex = 4 ;
        while (startIndex > 0){

            startIndex--;
            char eachChar = java.charAt(startIndex);
            System.out.println(eachChar);


        }
        System.out.println("xxxxxxxxxxxxxx");
        String str1 = "Obama";
        //whenever you are working with charAt();
        //indexes -> index stars from 0


        System.out.println(str1.charAt(4));
        System.out.println(str1.charAt(3));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(0));

        System.out.println("vvvvvvvvvvvvvv");

        int index1 = 4;
        while (index1 >= 0){
            System.out.println(str1.charAt(index1));
            index1--;
        }


        System.out.println("############");

        String str2 = "SpaceX Mars Mission";

        int index = str2.length()-1;
        while (index >= 0){
            System.out.println(str2.charAt(index));
            index--;

        }





    }
}

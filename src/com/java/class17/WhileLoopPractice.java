package com.java.class17;

public class WhileLoopPractice {
    //write a program to
    //1 10 2 9 3 8 4 7 5 6
    public static void main(String[] args) {
        int num11 = 1;
        int num12 = 10;

        while (num11 <= 5 && num12 >= 0) {
            System.out.println(num11++);
            System.out.println(num12--);

        }

        System.out.println("---------");


        int num = 1;
        int num2 = 10;
        while (num <= 5 ){
            System.out.println(num );
            System.out.println(num2);
            num++;
            num2--;
        }


        int num1 =1;//starting point

        //()-> how many times it should run?
        //if your problems is asking to run specific
        //number of times.
        //there should at least one var
        //
        while (num1 <= 10){
            //in the body of the while I must have a
            //boolean expression updater
            System.out.println("Hello");
            num1++;//updater
        }
        //1.define the right starting point
        //2.define a boolean  expression where
        //you are using the variable of starting point
        //3.write body of the while loop.
        //4. make sure you have an updater  of a variable in the boolean expression
    }
}
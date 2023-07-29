package com.java.class21;

public class Practice {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++){
            System.out.println("Hello");
        }
        for (int i=1; i<=2; i++){
            //i = 1;
            //i = 2;
            for (int j = 1; j <= 3; j++){
             //j = 1, 2, 3;
             //j = 1, 2, 3;
             //sum = 6
                System.out.println("Hi");
            }
        }

        for (int i=1; i<=3; i++){
            //i = 1;
            //i = 2;
            //i = 3;
            for (int j = 1; j <= 3; j++){
                //j = 1, 2, 3;
                //j = 1, 2, 3;
                //j = 1, 2, 3;
                //sum = 9
                System.out.println("Салам");
            }
        }
        System.out.println("xxxxxxxxxx");
        for (int i = 1; i <= 5; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("xxxxxxxx");

        for (int i = 1; i <= 5; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("##########");
        for (int i = 1; i<=5; i++){

            for (int j = 1; j <= 5; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}

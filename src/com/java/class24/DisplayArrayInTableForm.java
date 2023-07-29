package com.java.class24;

public class DisplayArrayInTableForm {
    //Find out sum of all elements from 2D array

    //Sum of row 1 = 15
    //Sum of row 1 = 14
    //Sum of row 1 = 15
    public static void main(String[] args) {
        int data[][] = {
                {3, 5,7},
                {5, 7,2},
                {6, 3, 1}
        };


        for (int i = 0; i < data.length; i++){

            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            } System.out.println();
        }



        int sum =0;

        for (int i =0; i <3; i++){
            for (int j = 0; j< 3; j++){
                System.out.print(data[i][j]+ " ");
                sum+=data[i][j];

            }
            System.out.println();

        }
        System.out.println(sum);

       for (int i =0; i< data.length; i++){
           int sum1 =0;

           for (int j=0; j< data[i].length; j++){
               sum1 = sum1 + data[i][j];

           }System.out.println("sum of row "+ (i+1) + " = " + sum1);
       }
    }
}

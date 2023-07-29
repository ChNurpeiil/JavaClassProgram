package com.java.class19;

public class ForLoopTricky {
    public static void main(String[] args) {

        for (int n = 1; n <= 0; n++){
            System.out.println(n+1);
        }
        System.out.println("-----------");

        for (int j = 1; j <= 10; ){
            j++;
            System.out.println(j+1);
        }

        System.out.println("========");


//        for (int m = 1; m <= 10; m++){
//
//        }
//        System.out.println(m);
//   this is error because this "int m" inside in for loop .
//   this "m"  System.out.println(m); another "m"

        System.out.println("xxxxxxxxxx");
        int i;
        for ( i =1; i<=10;i++){

        }
        System.out.println(i);
    }
}

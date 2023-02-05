package homework.java.homework13class13;

import java.util.Scanner;

public class InstanceMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Given two non-negative int values,
        // return true if they have the same last digit,
        // such as with 27 and 57.
        // Note that the % “mod” operator computes remainders,
        // so 17 % 10 is 7.
        System.out.println("Enter the first number : ");
        int num1 =sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        InstanceMethods2 in = new InstanceMethods2();
        if (num1 >= 0 && num2 >= 0){
            System.out.println(in.digit(num1, num2));
        }
        else {
            System.out.println("wrong input");
        }
//        System.out.println(in.threeOfFive);
    }
    public static boolean digit(int num1, int num2){
        return  num1%10 == num2%10;
    }
//    create a method that takes a non-negative int.
//Return true if the given non-negative number is
// a multiple of 3 or a multiple of 5.
// Use the % “mod” operator
    public static boolean threeOfFive(int num){
        return  num % 3== 0 || num % 5== 00;
    }
    public static boolean isTen( int num1, int num2){
        return num1 == 10 ||num2 == 10 || num1 +num2 ==10;

    }
}

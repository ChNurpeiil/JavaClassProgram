package homework.java.homework07;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        3. Write a program to print a welcome
        message to the passenger and
        notify them to do security checks
        if they are not coming from connecting flight,
        and at the end print "enjoy your flight"

        Example 1:
        Welcome to the Delta Air Lines
        Are you travelling from connecting flight(true/false)? true
        Enjoy your flight

        Example 2:
        Welcome to the Delta Air Lines
        Are you travelling from connecting flight(true/false)? false
        Please proceed to the security check
        Enjoy your flight
         */

        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you traveling from connecting flight");
        Scanner sc = new Scanner(System.in);
        boolean travell = sc.nextBoolean();

        if  (!travell) System.out.println("Please proceed to the security check");
        System.out.println("Enjoy your flight");
    }
}

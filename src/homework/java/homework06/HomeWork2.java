package homework.java.homework06;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

         /*HOMEWORK: Scanner.
        Write a credit landing program
        get user input for age, creditScore, marital status

        printout Approved: true
        if user is older than 25
        if user has a creditScore more than 700
        if user is married

        printout Approved: false
        if any of the conditions is wrong

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your age ");
        byte age = sc.nextByte();
        System.out.println("Your age "+age);

        System.out.println("Please enter your credit score");
        short creditScore = sc.nextShort();
        System.out.println("Your credit score "+creditScore);

        System.out.println("Please your marital status");
        String maritalStatus = sc.next();
        System.out.println("Your marital status "+maritalStatus);

        boolean landingProgram = age > 25 && creditScore >700 && maritalStatus.equalsIgnoreCase("maried");
        System.out.println(landingProgram);

    }
}

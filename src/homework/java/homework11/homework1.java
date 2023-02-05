package com.java.homework.hoomework11;

import java.util.Scanner;

public class homework1 {


    //As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.
    //Acceptance Criteria:
    //All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
    //All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
    //All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
    //All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the year : ");
        int year = sc.nextInt();
        System.out.println(leapYears(year));
    }
    public static boolean leapYears (int yaer){
        if(yaer % 400 == 0 || yaer % 4 == 0  && yaer % 100 != 0){
            return true;
        }
        else{
            return  false;
        }
    }
}

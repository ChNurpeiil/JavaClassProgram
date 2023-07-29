package homework.java.homework013;

import java.util.Scanner;

public class Homework1 {


    //As a user, I want to know if a year is a leap year,
    // So that I can plan for an extra day on February 29th during those years.
    //Acceptance Criteria:
    //1. All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
    //2. All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
    //3. All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
    //4. All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter the year : ");
        int year = sc.nextInt();


        System.out.println(leapYears(year));

    }

    public static boolean leapYears (int year){
        if(year % 400 == 0 || year % 4 == 0  && year % 100 != 0){
            return true;
        }
        else{
            return  false;
        }
    }
}

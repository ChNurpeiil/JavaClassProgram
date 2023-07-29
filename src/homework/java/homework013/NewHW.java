package homework.java.homework013;

import java.util.Scanner;

public class NewHW {
    public static void main(String[] args) {
        //As a user, I want to know if a year is a leap year,
        // So that I can plan for an extra day on February 29th during those years.
        //Acceptance Criteria:
        //1. All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
        //2. All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
        //3. All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
        //4. All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any year");
        int year = input.nextInt();

        NewHW var = new NewHW();
        System.out.println(var.LeapYear(year));

    }

    public boolean LeapYear(int year){
       return(year % 400 ==0 || year % 4==0 && year %100 != 0);



    }
}

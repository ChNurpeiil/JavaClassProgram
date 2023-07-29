package homework.java.homework011;

import java.util.Scanner;

public class NewHomework1 {
//    Homework switch statements 1:
//Write a program that takes a day of the week as input
// (e.g., “Monday”), and outputs the number
// of days until the next weekend (i.e., either Saturday
// or Sunday). Use a switch statement to implement this program.

//Sample outputs for input "Monday" would be "5"
// and input "Friday" would be "2"
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Do you  want to know when weekend?");
    System.out.println("Please enter the day of the week : ");
    String day = input.next();

    switch (day){
        case "Monday":
            System.out.println("5 days until the next weekend");
            break;
        case "Tuesday":
            System.out.println("4 days until the next weekend");
            break;
        case "Wednesday":
            System.out.println("3 days until the next weekend");
            break;
        case "Thursday":
            System.out.println("2 days until the next weekend");
            break;
        case "Friday":
            System.out.println("1 days until the next weekend");
            break;
        case "Saturday":
        case "Sunday":
            System.out.println("Today in weekend");
            break;
        default:{
            System.out.println("invalid input");
        }


    }

}

}

package homework.java.homework011;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the day of the week : ");
        String day = sc.nextLine();
        switch (day){
            case "Monday":
                System.out.println("5 days until the next weekend");
                break;
            case "Tuesday":
                System.out.println("4 days until the next weekend");
                break;
            case "Wendnesday":
                System.out.println("3 days until the next weekend");
                break;
            case "Thursday":
                System.out.println("2 days until the next weekend");
                break;
            case "Friday":
                System.out.println("1 days until the next weekend");
                break;
            case "Saturday":
            case "Sanday" :
                System.out.println("today day off");
                break;
            default:
                System.out.println(" Wrong input, Please try again");

        }

    }
}

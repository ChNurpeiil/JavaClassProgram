package homework.java.homework07;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        //Ask the user how many Java exercises are you solving per day?
        //if it's less than 3-> print out-> You are too lazy!
        //if it's more than or equal  3 and less than 5-> good job, but you should do better!
        //if it's more than or equals 5 than print out -> great job! You are on the right track!
        Scanner sc = new Scanner(System.in);
        System.out.println("How many exercises aare you solving per day?");
        byte  exercises = sc.nextByte();

        if (exercises < 3){
            System.out.println("You are too lazy!");
        }
        if (exercises >= 3 && exercises < 5){
            System.out.println("Good job, but you should do better!");
        }
        if (exercises >= 5){
            System.out.println("Great job! You are on the right track!");
        }

    }
}

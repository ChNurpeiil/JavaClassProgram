package homework.java.homework012;

import java.util.Scanner;

//Create a method that takes a person's
// height as a double (in meters) and
// returns their height in feet and
// inches. Google the formula
//ft = m * 3,28
//in = m* 39.37
public class NewHW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height (m):");
        double height = input.nextDouble();
        System.out.println(height + " meter is "+ converInFeet(height)+ " feet.");
        System.out.println(height + " meter is "+ coverInInches(height)+ " inches.");



    }
    public static double converInFeet(double height){
        return height * 3.28;
    }
    public static double coverInInches(double height) {
        return height * 39.37;
    }

}

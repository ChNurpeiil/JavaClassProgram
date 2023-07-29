package homework.java.homework012;

import java.util.Scanner;


public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your height in meters : ");
        double meters = sc.nextDouble();
        System.out.println(meters+ " meter is "+ converMetersFeet(meters) + " feet .");
        System.out.println(meters+ " meter is "+ converMetersInches(meters) + " inches .");

    }
    public static double converMetersFeet(double height){
        return  height * 3.28;
    }
    public static double converMetersInches(double height){
        return  height *32.37;
    }
}


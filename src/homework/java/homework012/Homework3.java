package homework.java.homework10;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you member of a loyalty program? (true/ false)? ");
        boolean memberOfLoyaltyPr = sc.nextBoolean();
        System.out.println("Please enter your cost of a purchase ? ");
        double costOfPurchase = sc.nextDouble();

        System.out.println(" final cost is "+ discount(memberOfLoyaltyPr, costOfPurchase) );
    }
    public static double discount(boolean memberOfLoyaltyPr, double costOfPurchase){
        if (memberOfLoyaltyPr) costOfPurchase *= 0.9;
        return  costOfPurchase;
    }
}

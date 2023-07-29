package homework.java.homework012;

import java.util.Scanner;

public class RepeatHW3 {
//    Create a method that takes a boolean indicating whether
//    someone is a member of a loyalty program and a double
//    representing the cost of a purchase, and returns a
//    double representing the final cost of the purchase after
//    applying a discount. If the customer is a loyalty
//    customer apply 10% discount.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your a member of a loyalty program? true / false");
    boolean memberOfLoyalty = input.nextBoolean();
    System.out.println("Please enter your cost of a purchase:");
    double costPurchase = input.nextDouble();

    System.out.println("Your discount is "+ discount(memberOfLoyalty, costPurchase));

}
public static double discount (boolean memberOfLoyalty, double costPurchase){
    if (memberOfLoyalty){
        return  costPurchase = costPurchase * 0.10;

    }
    return  costPurchase;

}


}

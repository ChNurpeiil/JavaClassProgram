package homework.java.homework8;

import java.util.Scanner;

/**
 * 
 */
public class homework1  {
    public static void main(String[] args) {
        System.out.println("1.Main Course");
        System.out.println("2.Appetizer");
        System.out.println("3.Drinks");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();

        if(choice1.equalsIgnoreCase("Main course") || choice1.equals("1")) {
            System.out.println("1. Lagman");
            System.out.println("2. NYC Steak");
            String choiceOfMain = sc.nextLine();

            if(choiceOfMain.equalsIgnoreCase("Lagman") || choiceOfMain.equals("1")) {
                System.out.println("Lagman Ingredients ...");
            } else if (choiceOfMain.equalsIgnoreCase("NYC Steak") || choiceOfMain.equals("2") ){
                System.out.println("NYC Steak Ingredients ...");
            } else {
                System.out.println("Invalid main choice ");
            }
        } else if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1.Spring Rolls");
            System.out.println("2. Egg Rolls");
            String choiceOfAppetizer = sc.nextLine();

            if (choiceOfAppetizer.equalsIgnoreCase ("Spring Rolls") || choiceOfAppetizer.equals("1")){
                System.out.println("Spring Rolls Ingredient ...");
            } else if (choiceOfAppetizer.equalsIgnoreCase("Egg Rolls") || choiceOfAppetizer.equals("2")) {
                System.out.println("Egg Rolls Ingredient ...");
            } else {
                System.out.println("Invalid appetizer choice");
            }
        } else if (choice1.equalsIgnoreCase("Drinks") || choice1.equals("3")) {
            System.out.println("1. Orange juice");
            System.out.println("2.Apple juice");
            System.out.println("3.Pineapple juice");
            String choiceOfDrink = sc.nextLine();

            if (choiceOfDrink.equalsIgnoreCase("Orange juice") || choiceOfDrink.equals("1")){
                System.out.println("Orange juice Ingredient...");
            } else if (choiceOfDrink.equalsIgnoreCase("Apple juice") ||choiceOfDrink.equals("2")) {
                System.out.println("Apple juice Ingredient...");
            } else if (choiceOfDrink.equalsIgnoreCase("Pineapple juice") || choiceOfDrink.equals("3")) {
                System.out.println("Pineapple juice Ingredient...");
            }else {
                System.out.println("Invalid Drinks choice.");
            }
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}

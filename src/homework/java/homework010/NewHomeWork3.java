package homework.java.homework010;

import java.util.Scanner;

public class NewHomeWork3 {
    public static void main(String[] args) {
        /*
Nested If statements homework 3:
Write a bank app to calculate interest rates on loans:
take input for loanAmount in $,  credit score between 300-850.
1. If the loan amount is less than $10,000
and the credit score is less than 600,
the interest rate is set to 15%.
2. If the loan amount is less than $10,000
and the credit score is 600 or higher,
 the interest rate is set to 10%.
3. If the loan amount is $10,000 or higher
and the credit score is less than 600,
the interest rate is set to 12%.
4. If the loan amount is $10,000 or higher
 and the credit score is 600 or higher,
 the interest rate is set to 8%.

Print out the interest rate.

Example output:
Please enter how much you want to loan:
9000
Please enter your credit score:
750
Your interest rate is 10%.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much you want to loan:");
        int loanAmount = input.nextInt();
        System.out.println("Please enter your credit score:");
        int creditScore = input.nextInt();

        if (loanAmount < 10000){
            if (creditScore < 600){
                System.out.println("Your interest rate is 15%.");
            } else if (creditScore >= 600) {
                System.out.println("Your interest rate is 10%.");
            }
        } else if (loanAmount >= 10000){
            if (creditScore < 600){
                System.out.println("Your interest rate is 12%.");
            } if (creditScore >= 600){
                System.out.println("Your interest rate is 8%.");
            }
        }
    }
}

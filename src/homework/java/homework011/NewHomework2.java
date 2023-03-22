package homework.java.homework9;

import java.util.Scanner;

public class NewHomework2 {
//    2. Write a program that takes an operator
//    (e.g., “+”, “-”, “*”, “/”) and two integers as input,
//    and outputs the result of the operation. Use a switch
//    statement to implement this program. Make sure
//    to consider the possibility of division by zero,
//    and any other edge cases.

//Sample outputs for input "+ 2 3" would be "5",
// input "/ 6 2" would be "3",
// input "* 7 8" would be "56",
// if we have edge case input "/ 5 0"
// would be "division by zero is not allowed" or similar message
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter first number:");
    int num1 = input.nextInt();
    System.out.println("Please enter second number:");
    int num2 = input.nextInt();
    System.out.println("Choice operator( *, /, +, -)");
    char operator = input.next().charAt(0);


    switch (operator){
        case '+':
            System.out.println(num1+num2);
            break;
        case '-':
            System.out.println(num1-num2);
            break;
        case '*':
            System.out.println(num1*num2);
            break;
        case '/':

            if (num2==0 ){
                System.out.println("division by zero is not allowed");
            } else {
                System.out.println(num1/num2);
            }
            break;

        default:
            System.out.println("wrong answer");

    }

}

}

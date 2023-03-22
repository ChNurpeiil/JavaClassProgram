package homework.java.homework9;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Pleaase enter the second number : ");
        int n2 = sc.nextInt();
        System.out.println("Please enter operator : ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Wrong operator, Please try again.");
        }
    }
}

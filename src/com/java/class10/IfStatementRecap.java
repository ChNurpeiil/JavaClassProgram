package class10;

import java.util.Scanner;

public class IfStatementRecap {
    public static void main(String[] args) {
        //1.Determining the minimum of three numbers;
        //ask the user to input 3
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1<n2 || n1<n3) {
            System.out.println(n1 + "is the greatest");
        } else if (n2>n1 || n3>n2) {
            System.out.println(n2 + "is the greatest");

        }
        else {
            System.out.println(n3 + "is the greatest");
        }

        //first step : before we jump to pseudocode - we need to clarify any missing requirements:
        //can all numbers be equal? If yes what should be the output


        //what if 2 numbers are largest and equal?
        //is there a limit for numbers? no
        //are these only whole numbers? or decimal pointed number - whle numbers
        //can we compare negative numbers? - yes


        //pseudocode -> is a the logic of a program
        //written in plain english.
        //I need to 3 integer numbers
        //My logic would like this
        //

        if (n1 > n2 && n1> n3){
            System.out.println(n1 +"is the largest number");
        } else if (n2> n1 && n2 > n3) {
            System.out.println(n2 +"is the largest number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 +"is the largest number");
        } else if (n3 == n1 && n3 ==n2) {
            System.out.println("All numbers are equal");
        } else if (n1 == n2 && n1>n3) {
            System.out.println(n1 + "");
        }
        // if all numbers are equal printOut"equal numbers"
    }
}

package homework.java.homework_13;

import java.util.Scanner;

public class homework13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num =sc.nextInt();
 //       int num = 0;
        int num2 = 0;
        int result = 0;
        while (num2 < 10 ){
            num2 ++;
            result= num * num2;
            System.out.println(num +" * "+ num2 +"= "+result);
        }
    }
}

package homework.java.homework21;

import java.util.Scanner;

//2. Write a program to print reverse of the given String
//Example
//Input - Wedevx
//Output - xvedeW
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}

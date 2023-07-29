package homework.java.homework23;

import java.util.Scanner;

public class Task3 {
//    3. Program to print the elements of
//    an array present in the odd position
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 45, 85
//Output: 65, 24, 85, 65, 85

    public static void main(String[] args) {
        int number []= new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any  10 number");

        for (int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length;i+=2){
            System.out.println(number[i]);
        }
    }


}

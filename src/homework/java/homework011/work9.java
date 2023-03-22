package homework.java.homework9;

import java.util.Scanner;

public class work9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("you gender? M or F");
        String gender = sc.next();
        char genderInYour = gender.charAt(0);
        System.out.println(genderInYour );

    }
}

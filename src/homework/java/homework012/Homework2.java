package homework.java.homework10;

import java.util.Scanner;

public class Homework2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please  enter your grade : ");
            char grade = sc.next().charAt(0);
            System.out.println(passingGrade(grade));
        }

        public static boolean passingGrade(char grade) {
            boolean passing = false;
            switch (grade) {
                case 'A':
                case 'B':
                    passing = true;
                    break;
                case 'C':
                case 'D':
                case  'F':
                    passing = false;
                    break;
                default:
                    System.out.println("Wrong  input, Please try again.");
            }
            return passing;
        }
}


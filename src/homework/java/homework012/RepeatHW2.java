package homework.java.homework10;

import java.util.Scanner;

public class RepeatHW2 {
//    Create a method that takes a char representing
//    a grade (A, B, C, D, or F) and returns a boolean
//    indicating whether the grade is passing or failing.
//    A and B are passing, C,D,F are failing.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your grade:");
    char grade = input.next().charAt(0);
    System.out.println(passingGrade(grade));

}
public static boolean passingGrade(char grade){
    if (grade == 'A' ||grade =='B'){
        return true;
    } else if (grade == 'C' || grade =='D' || grade == 'F') {
        return false;
    }else {
        System.out.println("Please enter only A, B, C, D, F");
    }
    return  false;
}

}

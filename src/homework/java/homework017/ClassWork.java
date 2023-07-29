package homework.java.homework017;

import java.util.Scanner;

public class ClassWork {
    //write program that print out
    //every other character of a String

    //ex:Java
    //a a
    //Hello
    //e l
    //World
    //o l
    //Mission Impossible
    //i s o m o s i l

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int num = 1;
        while (num < str.length()){

            char newChar = str.charAt(num);
            num+=2;
            System.out.println(newChar);
        }
    }
}

package homework.java.homework04;

import java.util.Scanner;

public class ScannerHome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please can you write age ");
        int age = input.nextInt();

        System.out.println("Please can you write creditScore");
        int creditScore = input.nextInt();

        System.out.println("Please can you write marital status ");
        String  maritalStatus = input.next();
        //==
        //!=

        //equals() -> maritalStatus.equals("married");
        //!equals() -> !maritalStatus.equals("married");


        boolean info = age > 25 || creditScore > 700 || maritalStatus.equals("married");
        //boolean info1 = age > 25 && creditScore > 700 && maritalStatus.equalsIgnoreCase("married");
        System.out.println("result: " + info);





    }
}

package homework.java.homework21;

public class Homework5 {
    public static void main(String[] args) {
// Write a program to print the below pattern
//    *
//   ***
//  *****
// *******
//*********
        int num = 5;
        for (int i =1; i<=num;i++){
            for (int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i *2 - 1; j++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

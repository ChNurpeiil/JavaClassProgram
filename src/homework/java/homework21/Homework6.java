package homework.java.homework21;

public class Homework6 {
    public static void main(String[] args) {
//         6.  Write a program to print the below pattern
//    *********
//     *******
//      *****
//       ***
//        *






        for (int i =5; i>=1; i--){

            for (int k = 1; k <= 5 - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2 * i - 1; j++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

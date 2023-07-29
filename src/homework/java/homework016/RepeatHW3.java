package homework.java.homework016;

public class RepeatHW3 {
    //    Write a program that uses a while loop to print
//    the multiplication table for a given number.
//     Enter number to print table: 7
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//7 * 4 = 28
//7 * 5 = 35
//7 * 6 = 42
//7 * 7 = 49
//7 * 8 = 56
//7 * 9 = 63
//7 * 10 = 70
    public static void main(String[] args) {

    int num = 9;
    int num2 = 1;
    int result = 0;

    while (num2 < 10){
      num2++;
      result = num * num2;
        System.out.println(num + " * " +  num2 + " = " + result );
    }
    }

}

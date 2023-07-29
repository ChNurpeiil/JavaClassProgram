package homework.java.homework24_09_02;

import java.lang.reflect.Array;
import java.util.Arrays;

//4. Write a program to sort array elements in ascending order using for-each loop
//Input: 5 2 8 7 1
//Output: 1 2 5 7 8
public class HW4 {
    public static void main(String[] args) {
        int number[] = {5, 2, 8, 7, 1};

        for (int i = 0; i < number.length; i++){
        }
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}

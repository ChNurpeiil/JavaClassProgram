package homework.java.homework24_09_02;

//2.  Write a program to find the sum of array elements using for-each loop
//Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//Output: 55
public class HW2 {

    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i =0; i< data.length; i++){
            sum = sum + data[i];
        }
        System.out.println("Sum is: " + sum);
    }

}

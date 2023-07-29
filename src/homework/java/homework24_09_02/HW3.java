package homework.java.homework24_09_02;

//3. Program to print the sum of the smallest
// and greatest number from the array using for-each loop
//Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
//Output: 124 (100 + 24)
public class HW3 {
    public static void main(String[] args) {
        int data[]= {45, 65, 85, 24, 45, 85, 34, 65, 100};

         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;

         for (int i = 0; i < data.length; i++){
             if (data[i]>max) {
                 max = data[i];
             }  if (data[i]< min) {
                 min = data[i];
             }
         }
        System.out.println("Smallest number is: "+ min);
        System.out.println("Greatest number is: "+ max);
        System.out.println("Sum: "+ (max+min));

    }
}

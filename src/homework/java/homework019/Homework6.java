package homework.java.homework019;

public class Homework6 {
//    6.  Java program to find sum of
//    1^2 + 2^2 + 3^2 + 4^2 + 5^2
public static void main(String[] args) {
      int sum = 0;
      for (int i=1; i<=5; i++){
        //  sum = sum +(int)Math.pow(i, 2);
          sum = sum +i * i;

      }
    System.out.println(sum);
}
}

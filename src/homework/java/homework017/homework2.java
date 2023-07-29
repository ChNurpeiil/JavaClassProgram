package homework.java.homework017;

public class homework2 {
//    Write a program that prints all prime
//    numbers between 1 and a 100  using a while loop.
public static void main(String[] args) {
    int i = 1;
    int primeNum = 0;
    while (i % 2 != 0 && i <= 100){
        System.out.println(i);
        i+=2;
    }
}
}

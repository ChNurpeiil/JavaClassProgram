package homework.java.homework09;

import java.util.Scanner;

public class Homework1 {
    /*
> **Write a program to find the greatest number
 out of three numbers using nested if statement**
>
**Question Type:** Write Code.
## Test Data:
```java
Example 1:
Input - 43, 54, 24
Output - 54 is the greatest
```
```java
Example 1:
Input - 53, 21, 65
Output - 65 is the greatest
```
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int first = input.nextInt();
        System.out.println("Please enter second number:");
        int second = input.nextInt();
        System.out.println("Please enter third number:");
        int third = input.nextInt();


        //I think this is just if else
        if (first > second && first > third){
            System.out.println(first+" is the greatest");
        } else if (second > first && second >third){

            System.out.println(second + " is the greatest");
        } else  {
            System.out.println(third+ " is the greatest");
        }






        //I think this is Nested If
        if (first > second && first > third){
            System.out.println(first +" is the greatest");
        }
        else {
            if (second > first && second >third){
                System.out.println(second + " is the greatest");
            }
            else {
                System.out.println(third + " is the greatest");
            }
        }



    }
}

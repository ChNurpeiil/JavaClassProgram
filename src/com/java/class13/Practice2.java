package com.java.class13;
public class Practice2 {
    public static void main(String[] args) {
        System.out.println(inTheRange(19, 1));
        System.out.println(inTheRange1(19,1));
    }
    public static boolean inTheRange(int n1, int n2){

        if (n1>=10 && n1 <= 20 || n2 >= 10 && n2 <= 20){
            return true;
        }
        return false;
    }
    public static boolean inTheRange1(int n1, int n2){
        //local variable are variable that are defined without a certain scope
        //so you can use same variable names as long as they are in completely
        //different scopes
        return n1>=10 && n1 <= 20 || n2 >= 10 && n2 <= 20;
        //1. if you have a method that returns boolean
        //2. if you have just a simple if and else logic
        //you can put the condition expression with return
    }

}

package com.java.homework;

public class AddHomeWORK {
    public static void main(String[] args) {
        //for example, take
        int var1 = 5;
        //then write
        //Pre-Increment ++var1:
        //increments and then uses the variable and get 6; var1=6;

        System.out.println(++var1);//6 var1 = 6;
        //Post-Increment var1++:uses and then increments the variable and get 6; var1=7;
        System.out.println(var1++);//6 var1 = 7;


        int var2 = ++var1;// 8 var1 = 8
        int var3 = var1++;// 8 var1 = 9
        int var4 = ++var1; //10 var1 = 10

        System.out.println(var1);//10
        System.out.println(var2);//8
        System.out.println(var3);//8
        System.out.println(var4);//10



//I have to explain what is happening on line 82 to 92
                //equals
        int var5 = 20;
        System.out.println(var1++);// print 20 , var1 = 21
        ////Post-Increment var1++:uses and then increments the variable and get 20; var1 =21;
        System.out.println(++var1);// print 22, var1 =22
        //Pre-Increment ++var1: increments and then uses the variable and get22 ; var1=22;


        int var6 = var1++; //22; var1 = 23;
        ////Post-Increment var1++:uses and then increments the variable and get 22; var1 =23;
        int var7 = ++var1; //24; var1 = 24;
        //Pre-Increment ++var1: increments and then uses the variable and get24 ; var1=24;
        System.out.println(var1);//24
        System.out.println(var2);//22
        System.out.println(var3);//24
    }
}

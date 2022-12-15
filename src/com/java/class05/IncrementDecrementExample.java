package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {
     int number0fClients =0;
     number0fClients++;
     System.out.println(number0fClients);

     number0fClients++;
     System.out.println(number0fClients);

     number0fClients++;
     System.out.println(number0fClients);//3

     number0fClients+=1;
        System.out.println();






        double gasPrice = 3.99;
        gasPrice++; //gasPrice = gasPrice +1.0
        System.out.println(gasPrice); //4.99

        double gasPriceAfterIax = gasPrice++;
        System.out.println(gasPriceAfterIax);






        //when you have  a post
        int num = 1;
        int y = num++;
        System.out.println(num); //2
        System.out.println(y);

        int x = 1;
        int w = ++x; // increments itself plus return the inc
        System.out.println(x);
        System.out.println(w);


        int z = 10;
        int r = z++;
        System.out.println(r);//10
        System.out.println(z);//11

        System.out.println(z++);//11 on line where you are post incrementing
        //the re
        System.out.println(z); //12

// post increment/de
        int u = 11;
        int q = u++; // q=11, u=12
        int t = q++;// t=11, q=12

        System.out.println(u);
        System.out.println(q);
        System.out.println(t);


        int ab = 50;
        int ac = ab++; //ac =50. ab=51
        int ad = ++ab; //ad=52, ab= 52
        System.out.println(ad++); //52
        System.out.println(++ab);//53
        int tempVar = ab++;
        //
        System.out.println(ab++); //53
        System.out.println(ab++); //54
        System.out.println(ab); //55

        int il =10;
        System.out.println(il++); //10



        int var1 = 20;
        System.out.println(var1++);//  20 , var1 = 21
        System.out.println(++var1);// 22, var1 =22

        int var2 = var1++; //22; var1 = 23;
        int var3 = ++var1; //24; var1 = 24;

        System.out.println(var1);//24
        System.out.println(var2);//22
        System.out.println(var3);//24





    }
}

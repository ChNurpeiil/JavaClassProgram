package com.java.class27;

class Car {
    static int price = 600;
    int speed = 200;//instance variable

//   static int color;//static variable

    void drive() {
        int speed =100;//local
        System.out.println(speed);
    }

}

public class StaticExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();

//        int num; //error
//        System.out.println(num);//error


//        int speed= 100; // Local Variable  - must be initialized before
//        System.out.println(speed);

//        System.out.println(speed);//error

//        System.out.println(c.speed);//200

//        System.out.println(Car.speed);//error
          System.out.println(Car.price);//
          System.out.println(c.price);//600
    }

}

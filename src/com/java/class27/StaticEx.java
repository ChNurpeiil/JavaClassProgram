package com.java.class27new;
class Car{
    int speed = 200;//Instance variable get created in memory only when you create object

    static void drive(){
        //Inside the static  method you can only use static variables
      //  System.out.println(speed);//error
    }
}
public class StaticEx {
    public static void main(String[] args) {
        Car c = new Car();
        Car.drive();//We can call static method without creating object
    }
}

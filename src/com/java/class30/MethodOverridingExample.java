package com.java.class30;



class  Car{
    void drive(){
        System.out.println("Driving at speed of 100");
    }

}
class SportCar extends Car{
    void drive(){
        System.out.println("Driving at speed of 180");
    }
}
public class MethodOverridingExample {

    public static void main(String[] args) {
       Car c = new Car();
       SportCar sc = new SportCar();

        c.drive();
        sc.drive();

    }
}

package com.java.class30;

class Shape{
    void draw(){
        System.out.println("Shape drawing");
    }
    void erase(){
        System.out.println("Shape erasing");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle drawing");
    }
    void erase(){
        System.out.println("Circle erasing");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Square drawing");
    }
    void erase(){
        System.out.println("Square erasing");
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Shape a = new Shape();
        Circle c = new Circle();
        Square s = new Square();
        a.draw();
        c.draw();
        s.draw();

    }
}

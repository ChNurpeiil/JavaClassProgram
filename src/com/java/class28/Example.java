package com.java.class28;

class Shop {
    void shop(String shop){
        System.out.println(shop + "This is big shop");
    }
}

class Vegetables extends Shop {
    void cucumber(String vegetabl) {
        System.out.println(vegetabl + " cucumber is very good ");
    }

    void carrot(String vegetabl) {
        System.out.println(vegetabl + "carrot also good ");
    }
}

class Fruits extends Vegetables {
    void apple(String fruits) {
        System.out.println(fruits + "an apple");
    }

}

public class Example {
    public static void main(String[] args) {
        Vegetables v = new Vegetables();

        Fruits f = new Fruits();
        f.apple("golden ");
        f.carrot("carrot ");
        f.cucumber("cucum ");
        f.shop("Pamil ");
    }

}

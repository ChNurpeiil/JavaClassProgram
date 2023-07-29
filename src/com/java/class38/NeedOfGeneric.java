package com.java.class38;

class  Box<T>{
    T num;

    T getNum(){
        return num;
    }
    void  setData(T num){
        this.num = num;
    }
}
public class NeedOfGeneric {
    public static void main(String[] args) {

        Box<String> b1 = new Box<String>();
        b1.setData("Hello");
        System.out.println(b1.getNum());

        Box<Integer>b2 = new Box<Integer>();
        b2.setData(20);
        System.out.println(b2.getNum());
    }
}

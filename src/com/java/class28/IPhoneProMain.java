package com.java.class28;
class Phone{
    Phone(){
        System.out.println("What  are you phone?");
    }
    void call(){
        System.out.println("Phone is call");
    }
    void text(){
        System.out.println("Phone is text");
    }
}
class IPhone extends Phone{
    IPhone(){
        System.out.println("My phone is IPhone).");
    }
    void callSiri(){
        System.out.println(" IPhone Call Siri");
    }
    void takeSiri(){
        System.out.println("IPhone Take Siri");
    }
}
class IPhonePro extends IPhone{
    void rotate(){
        System.out.println("IPhonePro rotate");
    }
    void bend(){
        System.out.println("IPhonePro bend");
    }
}
public class IPhoneProMain {
    public static void main(String[] args) {
        IPhonePro pro = new IPhonePro();
        pro.call();
        pro.text();
        pro.callSiri();
        pro.takeSiri();
        pro.rotate();
        pro.bend();
    }

}

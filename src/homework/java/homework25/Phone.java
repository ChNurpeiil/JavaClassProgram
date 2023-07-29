package homework.java.homework25;

public class Phone {

    String model;
    double price;
    int memory;
    String owner;

    Phone(String nameModel, int howMuchPrice){
        model= nameModel;
        price = howMuchPrice;
    }


    void photo(){
        System.out.println(model+" is take photo");
    }
    void call(){System.out.println(owner+" is calling");
    }
    void  sing(){
        System.out.println(model +": Memory is "+memory + ",\n\t\tHow much price "+ price+"%");
    }

}

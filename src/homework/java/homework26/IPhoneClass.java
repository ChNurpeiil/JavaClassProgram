package homework.java.homework26;

public class IPhoneClass {
    static String model1;
    static String color1;
    static double cost1;
    static int memory1;

    IPhoneClass() {
        System.out.println("This model is " + model1);
    }

    IPhoneClass(String model, int memory) {
        model1 = model;
        memory1 = memory;
        System.out.println("Model is " + model + "memory:" + model);
    }

    IPhoneClass(double cost) {
        cost1 = cost;
        System.out.println("Model cost is "+cost);
    }
    void ring(){
        System.out.println(model1+"is ringing");
    }
    void Phone(){
        System.out.println("This model is:"+model1+ "memory is:"+memory1);
    }
    void charge(){
        System.out.println("This just IPhone");
    }

}

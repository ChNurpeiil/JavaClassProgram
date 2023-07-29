package homework.java.homework25;

public class PhoneMainClass {
    public static void main(String[] args) {
       Phone huawei = new Phone("Huawei",500);
       huawei.owner= "Daniel";
       huawei.memory= 528;
        huawei.photo();
        huawei.call();
        huawei.sing();

        Phone apple = new Phone("Apple",1000);
        apple.owner="Turdakun";
        apple.memory=128;
        apple.photo();
        apple.call();
        apple.sing();

        Phone samsung = new Phone("Samsung",600);
        samsung.owner="Ulukbek";
        samsung.memory= 232;
        samsung.photo();
        samsung.call();
        samsung.sing();

    }
}

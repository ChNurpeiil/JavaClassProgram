package homework.java.homework28;
class A{
    public void run(){
        System.out.println("Running");
    }
}
class B extends A{
    public void run(){
        System.out.println("Walking");
    }
}
class C extends B{
    public void run(){
        System.out.println("Let's Run Now!");
    }
}
public class HomeWork_2 {
    public static void main(String[] args) {
        C c = new C();
        c.run();
    }
}

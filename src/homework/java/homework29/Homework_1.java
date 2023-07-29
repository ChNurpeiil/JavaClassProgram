package homework.java.homework29;
class Food{
    Food(){
        this("Steak");
        System.out.println("Food ");
    }
    Food(String name){

        System.out.println(name+"is food");
    }
}
class VegFood extends Food{
    VegFood(){
        this("Legumes ");
        System.out.println("Vegan Food");
    }

    VegFood(String veganFood){
        super("Coup ");
        System.out.println(veganFood+"is very good");
    }
}
class Salad extends VegFood{
    Salad(){
        this(true);
        System.out.println("Salad");
    }
    Salad(boolean with){
        super("Seaweed ");
        System.out.println("Salad with nut");
    }
}
public class Homework_1 {
    public static void main(String[] args) {
        Salad s = new Salad();

    }
}

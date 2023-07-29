package homework.java.homework25;

import java.util.WeakHashMap;

public class MainClass {
    public static void main(String[] args) {
        Class weather = new Class("sunny",8);
        weather.feel=4;
        weather.wear="dress";
        weather.today();
        weather.whatToWear();
        weather.howFeel();

        Class weather1 = new Class("rain",10);
        weather1.feel=8;
        weather1.wear="raincoat";
        weather1.today();
        weather1.whatToWear();
        weather1.howFeel();
        Class weather2 = new Class("snow",-10);
        weather2.feel=0;
        weather2.wear="coat";
        weather2.today();
        weather2.whatToWear();
        weather2.howFeel();


    }
}

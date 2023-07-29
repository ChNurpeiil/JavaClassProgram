package homework.java.homework25;

public class Class {

    String weather;
    double temperature;
    int feel;
    String wear;

    Class(String typeOfWeather, double howTemperature){
        weather = typeOfWeather;
        temperature = howTemperature;
    }

    void today(){
        System.out.println("Today is the "+weather);
    }
    void whatToWear(){
        System.out.println("I have to wear a "+ wear);
    }
    void howFeel(){
        System.out.println("Temperature is :"+temperature+" celsius but it feels like: "+feel +" celsius");
    }
}

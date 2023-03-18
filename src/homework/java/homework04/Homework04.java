package homework.java.homework4;

public class Homework04 {
    public static void main(String[] args) {
        //Login Functionality
//Write a logic which would tell the user if logged in or not
//you have a username
//you have a password
//you loginLocation

//in order to be logged your userName should match steve@apple.com
//and your password should be infinityLoop1
//and you location should be california
        String username = "zhanna@.com";
        String password = "infinityLoop1";
        String loginLocation = "california";

        boolean Login = username == "steve@apple.com" && password =="infinityLoop1"&& loginLocation =="california";
        System.out.println(Login);




    }

    public static class homework1 {
        public static void main(String[] args) {
            byte num1 = 127;
            short num2 = 14;
            int num3 = 4589;
            long num4 = 749289344;
            float num5 = 65793.647f;
            double num6 = 6759.303;
            String topic = "Sanday";
            boolean answer = false;
            char currency = '$';

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);
            System.out.println(topic);
            System.out.println(answer);
            System.out.println(currency);
        }
    }
}

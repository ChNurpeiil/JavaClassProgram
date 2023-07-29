package homework.java.homework06;

public class Homework1 {

    public static void main(String[] args) {

        /*Homework
        login Functionality
        Write a logic which would tell the user if logged in or not
        you have a password
        you loginLocation

        in order to be logged your userName should match steve@apple.com
        and your password should e infinityLoop1
        and your location should be california

        */

        String username = "steve@apple.com";
        String password = "nurpeiil";
        String loginLocation = "Kyrgyzstan";



        boolean logIn = username.equalsIgnoreCase("steve@apple.com") || password.equals("infinityLoop1") || loginLocation=="California";
        System.out.println(logIn);
    }
}

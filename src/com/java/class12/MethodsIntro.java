package com.java.class12;

public class MethodsIntro {
    public static void main(String[] args) {
        //when your method a has a return type  you should use the result & save the result in a variable.
        double num = calculateTax();
        System.out.println(num);
        double taxAmount =calculateTax2(150000);
        System.out.println(taxAmount);
        goTo("Mecca");
        goTo("Turkey");

    }
//        double spentAmount1 = 1000;
//        double taxPercent1 = 0.05;
//        double total = spentAmount1 +(spentAmount1*taxPercent1);
//
//        double spentAmount2 = 1000;
//        double taxPercent2 = 0.0;
//        double total2 = spentAmount2 +(spentAmount2*taxPercent2);
//
//        double spentAmount3 = 1000;
//        double taxPercent3 = 0.02;
//        double total3 = spentAmount3 +(spentAmount3*taxPercent3);


        //Methods are predefined logic
        //that can be used to execute through the
        //whole project
        //first put an access modifier --> public, protected, default, private
        //second put static
        //return data type --> any data type --> int,, double,flout,byte,char,short,boolean,String
        //what is return data type? ==>it's the data type of the result into of the function (Method)
        //return data type can also be void --> use  void when you want to create a method
        //that doesn't return any result -->for ex:just print some info.
        //when you have return type that is not void -> you must have a return statement
        //return statement must be followed by a value that has same data type
        //as your return type. you can get that value from calculations as well

        //next we have the name of the method -->name of the method should meaningful and follow camelCase. verbs
        //ex: sendEmail(),sendReceipt(),printTop10Customers()
        //the name of the method always finishes with parenthesis.
        //
        //

        //the body of any method can be as large as you need to be
        //you can have calculations
        //print out statements
        //if, switch for while - all statements.
        public static double calculateTax(){
            return 10.0 * 5.0;
        }
        //void methods do not require a return statement.
        public static void sayHello(){
            int year = 2023;
            double targetSalary = 130000;
            System.out.println("Hello" + year);
            System.out.println("My target salary is" + targetSalary);
        }
        //write a function that calculates
        // employees annual tax amount.
        //if the annual salary is less than 100k then tax percent is 10%
        //if more than 15%;
        public static double calculateTax2(double annualSalary){
            if (annualSalary <= 100000){
                return annualSalary * 0.10;
            }else {
                return annualSalary * 0.15;
            }
        }
        //Create a function that prints "I want to travel to _____"
        //____-> should be a variable.
        //I used be able to use this method multiple times and just provide different
        //values

         public static void goTo(String destination) {
            //the biggest different between a parameters and variable is that
             //variables need to be initialized right away.

          //  String destination = "Mecca";
             System.out.println("I want to travel to "+destination);
        }

        //Create a function that return true or false and will less us know if we can sleepIn.
        //it should take 2 params - one to know if 's a weekday
        //another param to know if it's a vacation.
        //we sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


}

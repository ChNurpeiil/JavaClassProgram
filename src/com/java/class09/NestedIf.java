package com.java.class09;

public class NestedIf {
    public static void main(String[] args) {
        boolean outBoolean = true;
        boolean innerBoolean = false;

        //first if statement scope {} -->is outer if statement
        //if line 12 if statement is false
        //


        //
        //
        //and inner if is false
        if (true) {

            if (false) {
                System.out.println("Hi from Inner If statement");
            }
        }

        if (true) {
            if (true) {
                System.out.println("Hi 3");
            }
        }


        if (true) {

            if (true) {
                System.out.println("Hi 4");
            }
            System.out.println("Outer Hi 4");
        }


        if (true) {
            System.out.println("Outer Hi 5.1");
            if (true) {
                System.out.println("Hi 5");
            }
            System.out.println("Outer Hi 5.2");
        }


        if (true) {
            System.out.println("Outer Hi 6.1");
            if (false) {
                System.out.println("Hi 6");
            }
            System.out.println("Outer Hi 6.2");
        }


        if (false) {
            System.out.println("Outer Hi 7.1");
            if (true) {
                System.out.println("Hi 7");
            }
            System.out.println("Outer Hi 7.2");
        }


        if (true) {
            System.out.println("Outer If Hi 8.1");
            if (true) {
                System.out.println(" Inner Hi 8");
            } else {
                System.out.println("Outer Else 8");
            }
            System.out.println("Outer Hi 8.2");
        }


        if (true) {
            System.out.println("Outer If Hi 9.1");
            if (false) {
                System.out.println(" Inner Hi 9");
            } else {
                System.out.println("Inner Else 9");
            }
            System.out.println("Outer Hi 9.2");
        }


        if (true) { //outer
            System.out.println("Outer If Hi 9.1");
            if (false) {//inner if
                System.out.println(" Inner Hi 9");
            } else {
                System.out.println("Inner Else 9");
            }
            System.out.println("Outer Hi 9.2");
        }


        if (true) { //outer
            System.out.println("Outer If  10.1");
            if (false) {//inner if
                System.out.println(" Inner If 10");
            } else {
                System.out.println("Inner Else 10");
            }
            System.out.println("Outer Hi 10.2");
        } else {
            System.out.println("Outer Else 10.1");
        }


        if (false) { //outer
            System.out.println("Outer If  11.1");
            if (false) {//inner if
                System.out.println(" Inner If 11");
            } else {
                System.out.println("Inner Else 11");
            }
            System.out.println("Outer If 11.2");
        } else {
            System.out.println("Outer Else 11.1");
        }


        if (false) { //outer
            System.out.println("Outer If  12.1");
            if (false) {//inner if
                System.out.println(" Inner If 12.2");
            } else {
                System.out.println("Inner Else 12.3");
            }
            System.out.println("Outer If 12.4");
        } else {
            System.out.println("Outer Else 12.5");
            if (false) {
                System.out.println("Inner If 12.6");
            } else if (true) {
                System.out.println("12.7");
            } else {
                System.out.println("12.8");
            }

            if (false) { //outer
                System.out.println(" 13.1");
                if (false) {//inner if
                    System.out.println(" 13.2");
                } else {
                    System.out.println(" 13.3");
                }
                System.out.println("13.4");
            } else {
                System.out.println("13.5");
                if (true) {
                    System.out.println(" 13.6");
                } else if (true) {
                    System.out.println("13.7");
                } else {
                    System.out.println("13.8");
                }


            }

            if (true){ //outer
                System.out.println(" 14.1");
                if (false){//inner if
                    System.out.println(" 14.2");
                }
                else if (true){
                    System.out.println(" 14.3");
                }
                else if (true)
                System.out.println("14.4");
            }
            else {
                System.out.println("14.5");
                }








        }
    }
}
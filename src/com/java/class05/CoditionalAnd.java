package com.java.class05;

public class CoditionalAnd {
    public static void main(String[] args) {
        //Conditional And is used when
        // you want to enforce multiple rules
        //before you execute your logic
        //all of the rules must be met

        // to issue certificate I want
        //student to have gpa more than 3.5
        //and I want student to have less than
        // 3 missed classed

        boolean giveSezimCertificate = false;

        double sezimGPA = 4.0;
        int sezimMissedClasses =3;
                                    //true          //false
        giveSezimCertificate = sezimGPA>3.5 &&sezimMissedClasses < 3;
        System.out.println(giveSezimCertificate);

        // write a program where you give your gpa
        // and number of missed classes
        //and print out result of giveCertificate

        boolean giveNurpeiilCertificate = false;

        double nurpeiilGPA = 5.2;
        int nurpeiilMissedClasses = 3;

        giveNurpeiilCertificate = nurpeiilGPA> 5.2 && nurpeiilMissedClasses < 3;
        System.out.println(giveNurpeiilCertificate);


    }
}

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

        // write a program where you give your age
        //tell if do you have a passport
        //return true if age is more than 16
        //and you have passport


        int yourAge = 29;
        boolean doesMeHavePassport = true;// ==> with
        //avoid writing true == true type of comparison.
        //doesMeHavePassport can be used by itself.
        boolean issueDriverLicense = yourAge >16 && doesMeHavePassport == true;
        System.out.println(issueDriverLicense);

        /* Homework
        write a program where you give your
        credit score
        your marital status
        number of children


        if credit score is more than 680
        married
        more than 2 children
         */
        boolean giveFamilyHealthInsuranceCoverage;

    }
}

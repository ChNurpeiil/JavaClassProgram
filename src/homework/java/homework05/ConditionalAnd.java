package homework.java.homework05;

public class ConditionalAnd {
    /* Homework
        write a program where you give your
        credit score
        your marital status
        number of children


        if credit score is more than 680
        married
        more than 2 children
         */
    public static void main(String[] args) {

        int creditScore = 800;
        boolean married = false;
        int numberOfChildren = 0;

        boolean giveFamilyHealthInsuranceCoverage = creditScore > 680 && married != true && numberOfChildren != 2;
        System.out.println(giveFamilyHealthInsuranceCoverage);
    }
}

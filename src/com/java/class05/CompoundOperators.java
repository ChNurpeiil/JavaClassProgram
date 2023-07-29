package com.java.class05;
/** Compound Operators are easy way to use the current value of a variable
* and add, substruct, multiple or divide by a new value and
 * reassign the resulting value info the original variable
 *
 * the only use case for compound operators is clean code
 * you avoid typing the variable name twice for the calculation
 *
 * less code is always a better code
*/

public class CompoundOperators {
    public static void main(String[] args) {
        int num1 = 10;
        num1 +=5; // num1 = num1+5;
        System.out.println(num1);

        int num2 = 11;
        num2+= 22; //num2 = num2+22; num2 = 22;
        System.out.println(num2);

        num2+= 5; // num2 = num2 +5  //38
        System.out.println(num2);

        num2+=11; // num2 = num2(33) +11;
        System.out.println(num2);

        num2+=14;
        System.out.println(num2);

        num2-=11; // num2 = num2-11  (52)
        System.out.println(num2);

        num2-=5; // num2 = num2-5; (47)
        System.out.println(num2);

        System.out.println(num2);// 47

        System.out.println(num2-5); // 42

        num2 -=2;// num2=num2-2
        System.out.println(num2); //45

        int number0fChicken =100;
        number0fChicken+=50;
        System.out.println(number0fChicken);//150

        number0fChicken*=2; // number0fChicken = number0fChicken*2
        System.out.println(number0fChicken); //300

        number0fChicken/=10;//number0fChicken = number0fChicken/10;
        System.out.println(number0fChicken);

        number0fChicken%=2;// number0fChicken%2;
        System.out.println(number0fChicken); // remainder is 0;



        int num = 10; //10
        System.out.println(num+5); //num=10
        num*=2; // 20
        num+=5; //25

        System.out.println(num+1); //num=25+1

        num-=5; //20
        System.out.println(num);




    }
}

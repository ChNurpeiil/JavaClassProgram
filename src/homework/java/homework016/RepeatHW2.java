package homework.java.homework016;

public class RepeatHW2 {
    //    1.Write a program that uses a while loop to print
//    the sum of the numbers from 1 to 10.
//    => 1+2+3+4+5+6+7+8+9+10. result should be 55?
    public static void main(String[] args) {

        int num =0;
        int result = 0;

        while (num < 10){
            num++;
            result= num+result;


        }System.out.println(result);
    }
}

package homework.java.homework22;
//3.  Write a program to count number of
// positive(consider zero also positive) and negative
// numbers from an array
//Example
//Input - 12, -45, 67, 23, -13, 45, -56
//Output - Positive Elements - 4,
// Negative Elements - 3
public class Homework3 {
    public static void main(String[] args) {
        int listOfData[]= {12, -45, 67, 23, -13, 45, -56};

        int positiveElement = 0;
        int negativeElement = 0;

         for (int i = 0; i < listOfData.length; i++){
             if (listOfData [i] >= 0){
                 positiveElement++;
             }else {
                 negativeElement++;
             }

         } System.out.println("Positive "+ positiveElement);
        System.out.println("Negative "+ negativeElement);
    }

}

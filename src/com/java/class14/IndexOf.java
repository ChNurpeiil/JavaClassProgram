package com.java.class14;

public class IndexOf {
    // indexOf(String str) --> return the index of the first occurrence
    //where there is no matching string then it will returns - 1

    //indexOf(String str, int i) ->returns the first occurrence of a strings after given index

    // lastIndexOf (String

    public static void main(String[] args) {
        String str = "tik tak";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));

        //indexOf(String str, int i) ->returns the first occurrence of a strings after given index


        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("FDgdfgdgd"));//-1
        System.out.println(str2.indexOf("bla"));
        System.out.println(str.indexOf("t"));



        String str3 = "Macbook Air, Nike Air, Ipod Air ";
        System.out.println(str3.indexOf("Air", 10
        ));
        System.out.println(str3.indexOf("Air", 19
        ));

        String  str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("La",5));
        System.out.println(str4.indexOf("la",5));
        System.out.println(str4.indexOf("la",13));
        System.out.println(str4.indexOf("la",14));

//Last index Of
        //lastIndexOf(String str)-> return the index of last occurrence of str. if not found returns -1;
        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String  str6 = "Almazova";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);
    }
}

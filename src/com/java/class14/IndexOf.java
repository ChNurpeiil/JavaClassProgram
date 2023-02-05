package com.java.homework14;

public class IndexOf {
    // indexOf(String str) --> return the index of the first occurrence
    //where
    //indexOf(String str, int i) ->

    // lastIndexOf (String
    public static void main(String[] args) {
        String str = "tik tac";
        System.out.println(str.indexOf("tak"));
        System.out.println(str.indexOf("k"));

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
        System.out.println(str4.indexOf("la",5));
        System.out.println(str4.indexOf("la",5));
        System.out.println(str4.indexOf("la",13));
        System.out.println(str4.indexOf("la",14));


        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));

        String  str6 = "Almazov";
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);
    }
}

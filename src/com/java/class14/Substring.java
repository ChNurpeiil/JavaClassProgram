package com.java.homework14;

public class Substring {
    //substring(int i) ==> return a String which a substring from int to the end of
    //original String

    // substring
    public static void main(String[] args) {
        String  str = "Hello World";
        System.out.println(str.substring(6)); // return a substring from W on
        System.out.println(str);

        String str1 = "Tesla Motors inc.";
        System.out.println(str1.substring(6));

        System.out.println(str1.substring(20));

        String str2 = "La Ferrari";
        System.out.println(str2.substring(3,8));

        String str3 = "Maldive Islands";
        System.out.println(str3.substring(0,7));



    }
}

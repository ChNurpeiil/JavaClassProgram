package com.java.homework14;

public class StringPractice2 {
    //concat
    //String are immutable objects
    //
    public static void main(String[] args) {
        //two ways of concatenating Strings
        //one via  + sign
        String str = "<html>";
        str += "<html>"; //str = str +"<html>";
        str += "<h1> Hello DevX </h1>";
        str += "</body>";
        str +="</html>";

        System.out.println(str);

        String str1 = "public class Hello";
        //concat method
       str1= str1.concat("{");

        //\n ->creates new line
        //\t -> creates a tab.
        //
        //
        str1= str1.concat("{");













        String str4= "Hello";
        str4.concat("DevX");
        System.out.println(str4);

        String str5= "I";
        str4.concat("Love");
        str5 = str5.concat("Java");
        System.out.println(str5);

    }
}

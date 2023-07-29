package com.java.class15;

public class Trim {
    public static void main(String[] args) {
        String str = "Elon ";
        boolean isEgual = str.equals("Elon");
        System.out.println(isEgual);

        String answer = "yes ";
        boolean yesOrNo = answer.equalsIgnoreCase("yes");
        System.out.println(yesOrNo);

        System.out.println(answer.trim());//return yes the without the space
        //method chaining only if the method return a String
        switch (answer.toLowerCase().trim()) {
        }

        if (answer.trim().equalsIgnoreCase("elon musk")) {
        }

    }
}

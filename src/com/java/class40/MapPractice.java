package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> salary = new HashMap<>();

        salary.put("Dana", 2400);
        salary.put("Chirag", 2000);
        salary.put("Azat", 6000);
        salary.put("Emily", 1500);
        salary.put("Chirag", 7200);
        salary.put("Aizhan", 6700);
        salary.put("Madina", 7400);
        salary.put("Milana", 1800);

//        int maxSalary = Integer.MIN_VALUE;
//        String employeeWithMaxSalary = null;
//
//        for(Map.Entry<String,Integer> e  : salary.entrySet()){
//            String emp = e.getKey();
//            int salaryy = e.getValue();
//
//            if(salaryy > maxSalary){
//                maxSalary = salaryy;
//                employeeWithMaxSalary = emp;
        Set<Map.Entry<String, Integer>> pairs = salary.entrySet();
        int max = 0;
        String name = " ";
        for (Map.Entry<String, Integer> pair : pairs) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                name = pair.getKey();
            }
        }
        System.out.println("Name is "+name+" max salary is "+max);
        int sum = 0;
        for (Map.Entry<String, Integer> pair : pairs){
            sum += pair.getValue();

        }
        System.out.println(sum);
        int aveSalary = sum / salary.size();
        for (Map.Entry<String, Integer> pair : pairs){
            if (pair.getValue()>= aveSalary){
                System.out.println(pair.getKey());
            }
        }
        int inc = 0;
        for (Map.Entry<String, Integer> pair : pairs){
            inc = pair.getValue()*20/100+pair.getValue();
            System.out.println(name+" "+pair.getValue()+"- "+ inc);
        }
    }

    //   System.out.println(employeeWithMaxSalary);


}


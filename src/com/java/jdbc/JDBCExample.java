package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        // 1.Connect
        String url = "jdbc:mysql://localhost:3306/mycompany";
        String username = "root";
        String password = "nurpeiil12";

        Class.forName("com.mysql.cj.jdbc.Driver"); //To register driver
        Connection con = DriverManager.getConnection(url, username,password);

        //2.Query
         //Statement interface has method to execute query so we create object of statement
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select first_name from employees");

        //3.Print Result
        while (rs.next()) {

            System.out.println(rs.getString("first_name"));
        }


        //4. Close
        con.close();


    }
}

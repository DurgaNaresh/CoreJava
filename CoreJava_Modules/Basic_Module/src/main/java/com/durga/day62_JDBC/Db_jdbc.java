package com.durga.day62_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Db_jdbc {
    public static void main(String[] args) {
        String JDBC_URL = "jdbc:mysql://localhost:3306/p4n";
        String JDBC_USERNAME = "root";
        String JDBC_PASSWORD = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            //step number 5th get all data from database...
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/javadev","root","root");

            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select * from Student");

            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

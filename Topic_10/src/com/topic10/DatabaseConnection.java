package com.topic10;

import java.sql.*;

public class DatabaseConnection {
	
	public static void main(String[] args) {
		
		try{
			//Loading driver
			Class.forName("com.mysql.jdbc.Driver");

			//creating connection
			Connection con = DriverManager.getConnection
					("jdbc:mysql:/ /localhost:3305/java","root","root");

			Statement s = con.createStatement();    //creating statement

			ResultSet rs = s.executeQuery("select * from Student"); //executing statement

			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}

			con.close();    //closing connection
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

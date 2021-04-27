package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class firstJDBC {
	
	static String DB_URL = "jdbc:mysql://localhost:3306/ibm2021";
    static String username = "root";
     static String password ="1234";

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //regestering the driver
			
			System.out.println("creating connection"); //creating connecting application and sql query
			Connection conn =  DriverManager.getConnection(DB_URL,username,password);
			PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?,?)");//adding some sql quiries
			pst.setInt(1, 105); //passing the values
			pst.setString(2, "adam");// passing the values 
			pst.setNString(3, "USA");// passing the value
			pst.setInt(4, 5565); // passing the values
			
			pst.executeUpdate();//update  or inserted into the database
			System.out.println("value inserted");
			conn.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	  

	}

}

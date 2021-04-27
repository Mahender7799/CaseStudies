package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_Retrieve {

	public static void main(String[] args) throws SQLException {
		String driver ="com.msql.cj.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/ibm2021";
        String username ="root";
        String password = "1234";
       
        Connection con = DriverManager.getConnection(url,username,password);
        
        PreparedStatement pst = con.prepareStatement("select * from emp");
        ResultSet rs =pst.executeQuery();
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" " + rs.getString(2));
        	
        }
        
        con.close();
	}

}

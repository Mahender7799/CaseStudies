package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        String driver ="com.msql.cj.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/ibm2021";
        String username ="root";
        String password = "1234";
       
        Connection con = DriverManager.getConnection(url,username,password);
        
        //insert values
        
        PreparedStatement pst = con.prepareStatement("insert into emp(id,name)values(?,?)");
        pst.setInt(1,105);
        pst.setString(2, "john");
        int i  = pst.executeUpdate();
        System.out.println(i + " record inserted");
        
        
       //delete record from database
        pst=con.prepareStatement("delete from emp where id=?");
        pst.setInt(1,105);
        int x =pst.executeUpdate();
        System.out.println(x +"record is deleted");
        
        con.close();
    }
}

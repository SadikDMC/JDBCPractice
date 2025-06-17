package com.telusko.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoClass2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:mysql://localhost/aliens";
		String uname = "root";
		String pass = "Sadik@mca@62";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from student;");
		String userData = "";
		while(rs.next()) {
			userData = rs.getInt(1)+ " " + rs.getString(2);
			System.out.println(userData);	
			}		
	}

}

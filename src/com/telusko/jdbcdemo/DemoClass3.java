package com.telusko.jdbcdemo;
import java.sql.*;

public class DemoClass3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/aliens","root","Sadik@mca@62");
		Statement st = con.createStatement();
		String username= "Thufel";
		int id = 8;
		int count = st.executeUpdate("insert into student values(" + id +",'" + username + "')" );
		System.out.println(count);
	}

}

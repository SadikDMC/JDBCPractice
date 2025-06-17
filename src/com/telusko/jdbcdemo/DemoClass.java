package com.telusko.jdbcdemo;
// Java Database Connectivity 
/*
 * 1.import ----> java.sql
 * 2.laod and register the drver
 * 3.create connection
 * 4.create a statement
 * 5.execute query
 * 6.process the results
 * 7.close
 */
import java.sql.*;// step 1

import com.mysql.cj.jdbc.Driver;//step 2a 
public class DemoClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url ="jdbc:mysql://localhost:3306/aliens";
		String user ="root";
		String password="Sadik@mca@62";
		String query = "select * from student where userid = 1";
		Class.forName("com.mysql.cj.jdbc.Driver");//step2b
		Connection con = DriverManager.getConnection(url,user,password);//step 3
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		String name = rs.getString("userName");
		System.out.println(name);
		st.close();
		con.close();
	}

}

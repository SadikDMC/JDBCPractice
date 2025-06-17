package com.telusko.jdbcdemo;
import java.sql.*;

public class DemoClass4 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost/aliens";
		String uname = "root";
		String pass = "Sadik@mca@62";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		String query = "insert into student values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		int id = 9;
		String name = "Bhaskar";
		ps.setInt(1, id);
		ps.setString(2,name);
		int count = ps.executeUpdate();
		System.out.println(count + "row/s affected");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
	}

}

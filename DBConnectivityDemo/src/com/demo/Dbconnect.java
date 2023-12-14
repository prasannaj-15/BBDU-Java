package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnect {

	public static void main(String[] args) {
		
		// 2. Load the jdbc driver related main class into the memory.

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 3. Prepare the connection String.
		
		
		String url = "jdbc:mysql://localhost:3306/iotbcdb";
		
		
		// 4. Establish the connection
		Connection conn = null;
		
		try {
		  conn = DriverManager.getConnection(url, "root", "root");
		
			Statement st = conn.createStatement();
			
			int x = st.executeUpdate("insert into student values(10,'harry',100)");
		
			if(x > 0) {
				System.out.println(x + " record inserted sucessfully...!");
			}
			else {
				System.out.println("Record not inserted...");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

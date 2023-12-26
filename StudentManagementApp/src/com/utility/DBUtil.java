package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

;

public class DBUtil {

	
	public static Connection provideConnection() {
		
		// load driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// preparing connection string
		
		String url = "jdbc:mysql://localhost:3306/studentdb";
		
		
		 Connection conn= null;
		try {
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
}

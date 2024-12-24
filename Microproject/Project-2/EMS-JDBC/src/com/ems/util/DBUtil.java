package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##", "root",
					"Toor25##");
		} catch (ClassNotFoundException e1) {
			System.out.println("Could not load the driver" + " " + e1);
		} catch (SQLException e) {
			System.out.println("Could not Connect to the Database" + " " + e);
		}
		return con;
	}
}

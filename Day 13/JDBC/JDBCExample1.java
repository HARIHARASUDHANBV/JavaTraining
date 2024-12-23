package com.Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Step-1: Loading Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step-2:Making Connection with Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##",
				"root", "Toor25##");

		// Step-3:Creating a statement
		String sql = "insert into tbl_employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step-4:Executing the query

		ps.setInt(1, 1203);
		ps.setString(2, "Aristotle");
		ps.setInt(3, 50000);
		ps.setInt(4, 50);

		int n = ps.executeUpdate(); // Insert,Delete,Update

		if (n == 1) {
			System.out.println("Employee Record Inserted");
		} else {
			System.out.println("Employee Record not Inserted");
		}

		ps.close();
		con.close();
	}
}

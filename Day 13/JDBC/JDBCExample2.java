package com.Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##",
				"root", "Toor25##");

		String sql1 = "delete from tbl_employee where eid=?";
		PreparedStatement ps1 = con.prepareStatement(sql1);

		ps1.setInt(1, 1203);
		int n1 = ps1.executeUpdate();

		if (n1 == 1) {
			System.out.println("Employee Record Deleted");
		} else {
			System.out.println("Not Deleted");
		}
		ps1.close();
		con.close();
	}
}

package com.Day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##",
				"root", "Toor25##");

		String sql2 = "update tbl_employee set ename=? where eid=?";
		PreparedStatement ps2 = con.prepareStatement(sql2);

		ps2.setInt(2, 1202);
		ps2.setString(1, "Socrates");

		int n2 = ps2.executeUpdate();

		if (n2 == 1) {
			System.out.println("Record Updated");
		} else {
			System.out.println("Not updated");
		}
		DatabaseMetaData db = con.getMetaData();
		System.out.println(db);
		System.out.println(db.getDatabaseProductName());
		System.out.println(db.getDriverName());
		System.out.println(db.getDriverVersion());


		ps2.close();
		con.close();
	}

}

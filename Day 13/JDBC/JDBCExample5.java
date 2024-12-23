package com.Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##",
				"root", "Toor25##");

		String sql = "insert into tbl_employee values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, 1203);
		ps.setString(2, "Immanuel");
		ps.setInt(3, 50000);
		ps.setInt(4, 50);
		ps.addBatch();

		ps.setInt(1, 1204);
		ps.setString(2, "Aristotle");
		ps.setInt(3, 60000);
		ps.setInt(4, 60);
		ps.addBatch();

		Object Employee[][] = new Object[][] { { 1205, "Aristophanes", 70000, 70 }, { 1206, "Sophicles", 80000, 80 }, };
		for (int i = 0; i < Employee.length; i++) {
			ps.setInt(1, (Integer) Employee[i][0]);
			ps.setString(2, (String) Employee[i][1]);
			ps.setInt(3, (Integer) Employee[i][2]);
			ps.setInt(4, (Integer) Employee[i][3]);
			ps.addBatch();
		}
		ps.executeBatch();

		ps.close();
		con.close();

	}

}

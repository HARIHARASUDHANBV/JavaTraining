package com.Day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/object?user=root&password=Toor25##",
				"root", "Toor25##");

		String sql = "select * from tbl_employee";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		for (int i = 1; i <= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}
		while (rs.next()) {
			System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("esalary") + " "
					+ rs.getInt("dno"));
		}
		rs.close();
		ps.close();
		con.close();
	}

}

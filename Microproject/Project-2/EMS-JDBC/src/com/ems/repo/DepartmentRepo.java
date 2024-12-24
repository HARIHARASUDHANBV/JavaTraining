package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.modal.Department;
import com.ems.util.DBUtil;

public class DepartmentRepo {
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "insert into tbl_department values(?,?)";
			PreparedStatement ps = conn.prepareStatement(str);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Insert Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doDeleteDepartment(int id) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "delete from tbl_department where dno=?";
			PreparedStatement ps = conn.prepareStatement(str);

			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "update tbl_department set dname=? where dno=?";
			PreparedStatement ps = conn.prepareStatement(str);

			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Update Query not Executed" + " " + e);
		}
		return flag;
	}

	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "select * from tbl_department where dno=?";
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));

			}

		} catch (SQLException e) {
			System.out.println("Find Query not executed" + " " + e);
		}
		return department;
	}

	public List<Department> doFindAllDepartment() {
		List<Department> list = new LinkedList<Department>();
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "select * from tbl_department";
			PreparedStatement ps = conn.prepareStatement(str);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Department department = new Department();
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dname"));

				list.add(department);

			}
		} catch (SQLException e) {
			System.out.println("FindAll Query not executed" + " " + e);
		}
		return list;
	}
}

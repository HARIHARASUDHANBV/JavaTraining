package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.modal.Department;
import com.ems.modal.Employee;
import com.ems.util.DBUtil;

public class EmployeeRepo1 {

	DepartmentRepo departmentRepo = new DepartmentRepo();
	int dept_no;

	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "insert into tbl_employee values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(str);

			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getEsalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Insert Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doDeleteEmployee(int id) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "delete from tbl_employee where eid=?";
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

	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "update tbl_employee set ename=?,esalary=?,dno=? where eid=?";
			PreparedStatement ps = conn.prepareStatement(str);

			ps.setString(1, employee.getEname());
			ps.setInt(2, employee.getEsalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEid());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Update Query not Executed" + " " + e);
		}
		return flag;
	}

	public Employee doFindEmployee(int id) {
		Employee employee = null;
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "select * from tbl_employee where eid=?";
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				dept_no = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(dept_no);
				employee.setDepartment(department);
			}

		} catch (SQLException e) {
			System.out.println("Find Query not executed" + " " + e);
		}
		return employee;
	}

	public List<Employee> doFindAllEmployee() {
		List<Employee> list = new LinkedList<Employee>();
		try {
			Connection conn = DBUtil.getDBConnection();
			String str = "select * from tbl_employee";
			PreparedStatement ps = conn.prepareStatement(str);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				dept_no = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(dept_no);
				employee.setDepartment(department);
				list.add(employee);

			}
		} catch (SQLException e) {
			System.out.println("FindAll Query not executed" + " " + e);
		}
		return list;
	}
}

package com.ems.view;

import java.util.Scanner;

import com.ems.modal.Department;
import com.ems.modal.Employee;

public class EmployeeView {
	static Scanner input = new Scanner(System.in);
	static int eid, esalary, dno;
	static String ename, dname;

	public static Employee insertEmployeeView() {
		System.out.println("Enter Employee_id,name and salary and dno");
		eid = input.nextInt();
		ename = input.next();
		esalary = input.nextInt();
		dno = input.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(eid, ename, esalary, department);
	}

	public static int deleteEmployeeView() {
		System.out.println("Enter Employee_id");

		return input.nextInt();
	}

	public static Employee updateEmployeeView() {
		System.out.println("Enter Employee_id,name and salary and dno");
		eid = input.nextInt();
		ename = input.next();
		esalary = input.nextInt();
		dno = input.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(eid, ename, esalary, department);
	}

	public static int findEmployeeView() {
		System.out.println("Enter Employee_id");

		return input.nextInt();
	}

}

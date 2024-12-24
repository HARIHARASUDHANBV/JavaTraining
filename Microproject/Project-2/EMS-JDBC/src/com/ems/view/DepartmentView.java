package com.ems.view;

import java.util.Scanner;

import com.ems.modal.Department;

public class DepartmentView {
	static Scanner input = new Scanner(System.in);
	static int dno;
	static String dname;

	public static Department insertDepartmentView() {
		System.out.println("Enter dno and dname");
		dno = input.nextInt();
		dname = input.next();

		return new Department(dno, dname);
	}

	public static int deleteDepartmentView() {
		System.out.println("Enter Department_id");

		return input.nextInt();
	}

	public static Department updateDepartmentView() {
		System.out.println("Enter dno and dname");
		dno = input.nextInt();
		dname = input.next();

		return new Department(dno, dname);
	}

	public static int findDepartmentView() {
		System.out.println("Enter Department_id");

		return input.nextInt();
	}

}

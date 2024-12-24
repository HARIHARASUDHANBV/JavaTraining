package com.ems.main;

import java.util.Scanner;

import com.ems.modal.Department;
import com.ems.modal.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;
import com.ems.view.DepartmentView;
import com.ems.view.EmployeeView;

public class EMSApp {
	static Scanner input = new Scanner(System.in);

	public static int menu() {
		System.out.println("1.Insert Employee");
		System.out.println("2.Delete  Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Find Employee");
		System.out.println("5.Find All Employee");
		System.out.println("6.Insert Department");
		System.out.println("7.Delete Department");
		System.out.println("8.Update Department");
		System.out.println("9.Find Departmnent");
		System.out.println("10.Find All Department");
		System.out.println("11.Exit");

		System.out.println("Enter your Choice:");
		int choice = input.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// Composition
		EmployeeService employeeService = new EmployeeService();
		DepartmentService departmentService = new DepartmentService();

		String result = "";
		Department d1;
		Employee e1;
		int id;
		String msg = "";
		do {
			int ch = menu();
			switch (ch) {
			case 1:
				e1 = EmployeeView.insertEmployeeView();
				result = employeeService.insertEmployeeValidation(e1);
				System.out.println(result);
				break;

			case 2:
				id = EmployeeView.deleteEmployeeView();
				result = employeeService.deleteEmployeeValidation(id);
				System.out.println(result);
				break;

			case 3:
				e1 = EmployeeView.updateEmployeeView();
				result = employeeService.updateEmployeeValidation(e1);
				System.out.println(result);
				break;

			case 4:
				id = EmployeeView.findEmployeeView();
				result = employeeService.findEmployeeValidation(id);
				System.out.println(result);
				break;

			case 5:
				result = employeeService.findAllEmployeeValidation();
				System.out.println(result);
				break;

			case 6:
				d1 = DepartmentView.insertDepartmentView();
				result = departmentService.insertDepartmentValidation(d1);
				System.out.println(result);
				break;
			case 7:
				id = DepartmentView.deleteDepartmentView();
				result = departmentService.deleteDepartmentValidation(id);
				System.out.println(result);
				break;
			case 8:
				d1 = DepartmentView.updateDepartmentView();
				result = departmentService.updateDepartmentValidation(d1);
				System.out.println(result);
				break;
			case 9:
				id = DepartmentView.findDepartmentView();
				result = departmentService.findDepartmentValidation(id);
				System.out.println(result);
				break;
			case 10:
				result = departmentService.findAllDepartmentValidation();
				System.out.println(result);
				break;
			case 11:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to Continue [Yes | No]:");
			msg = input.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}

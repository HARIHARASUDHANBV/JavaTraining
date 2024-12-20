package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @author HARIHARASUDHAN.B.V.
 * @version 1.0 Driver Class of the Employee Management System Application.
 */
public class EMSApp {
	static Scanner input = new Scanner(System.in);

	public static int menu() {
		System.out.println("1.Insert Employee");
		System.out.println("2.Delete  Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Find Employee");
		System.out.println("5.Find All Employee");
		System.out.println("6.Exit");

		System.out.println("Enter your Choice:");
		int choice = input.nextInt();
		return choice;
	}

	/**
	 * 
	 * @return Employee Used to get the data to be inserted in the Specified
	 *         Collection.
	 */
	public static Employee insertView() {
		System.out.println("Enter Employee_id,name and salary");

		return new Employee(input.nextInt(), input.nextDouble(), input.next());
	}

	/**
	 * 
	 * @return int. Used to get the data to be deleted from the Specified
	 *         Collection.
	 */
	public static int deleteView() {
		System.out.println("Enter Employee_id");

		return input.nextInt();
	}

	/**
	 * 
	 * @return Employee Used to update the specified details in the Collection.
	 */
	public static Employee updateView() {
		System.out.println("Enter Employee_id,name and salary");

		return new Employee(input.nextInt(), input.nextDouble(), input.next());
	}

	/**
	 * 
	 * @return int. Used to find the particular Employee's detail.
	 */
	public static int findView() {
		System.out.println("Enter Employee_id");

		return input.nextInt();
	}

	public static void main(String[] args) {
		// Composition
		EmployeeService employeeService = new EmployeeService();
		String result = "";
		Employee e1;
		int id;
		String msg = "";
		do {
			int ch = menu();
			switch (ch) {
			case 1:
				e1 = insertView();
				result = employeeService.insertValidation(e1);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				e1 = updateView();
				result = employeeService.updateValidation(e1);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to Continue [Yes | No]:");
			msg = input.next();
		} while (msg.equalsIgnoreCase("Yes"));
	}

}

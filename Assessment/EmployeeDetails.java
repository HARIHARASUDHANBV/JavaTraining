package com.assessment;

import java.util.Scanner;

class Employee {
	String name;
	String job_title;
	int salary;
	double allowance, deductions, bonus, tax, overtime;
	Scanner in = new Scanner(System.in);

	public Employee(String name, String job_title, int salary, double allowance, double deductions, double bonus,
			double tax) {
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
		this.allowance = allowance;
		this.deductions = deductions;
		this.bonus = bonus;
		this.tax = tax;
	}

	double calculateGrossSalary() {
		return salary + allowance + overtime + bonus;
	}

	double calculateTax() {
		return calculateGrossSalary() * (tax / 100);
	}

	double calculateNetSalary() {
		return calculateGrossSalary() - calculateTax() - deductions;
	}

	void enterDetails() {
		System.out.println("Enter the name of the Employee:");
		name = in.nextLine();
		System.out.println("Enter the job Title:");
		job_title = in.nextLine();
		System.out.println("Enter the salary:");
		salary = in.nextInt();
		System.out.println("Enter the Allowance given to the Employee:");
		allowance = in.nextDouble();
		System.out.println("Enter the Overtime pay for the Employee:");
		overtime = in.nextDouble();
		System.out.println("Enter the bonus given to the Employee:");
		bonus = in.nextDouble();
		System.out.println("Enter the Tax rate:");
		tax = in.nextDouble();
		System.out.println("Enter the deductions from  the Employee:");
		deductions = in.nextDouble();

	}

	void displayDetails() {
		System.out.println("The name of the Employee is:" + " " + name);
		System.out.println("The job description of the Employee is:" + " " + job_title);
		System.out.println("The Salary of the Employee is:" + " " + salary);
		System.out.println("The Allowance for the Employee is:" + " " + allowance);
		System.out.println("The overtime for the Employee is:" + " " + overtime);
		System.out.println("The bonus for the given Employee is:" + " " + bonus);
		System.out.println("The gross salary is:" + " " + calculateGrossSalary());
		System.out.println("The tax return of the Employee is:" + " " + calculateTax());
		System.out.println("The Net Salary is:" + " " + calculateNetSalary());
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Alexander = new Employee(null, null, 0, 0, 0, 0, 0);
		Alexander.enterDetails();
		Alexander.calculateGrossSalary();
		Alexander.calculateTax();
		Alexander.calculateNetSalary();
		Alexander.displayDetails();
	}

}

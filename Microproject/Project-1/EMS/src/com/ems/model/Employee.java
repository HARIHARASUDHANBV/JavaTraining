package com.ems.model;

/**
 * @author HARIHARASUDHAN B.V
 * @version 1.0. Its a modal class for Employee
 */
public class Employee {
	private int e_id;
	private double salary;
	private String employee_name;

	public Employee() {
		super();
	}

	public Employee(int e_id, double salary, String employee_name) {
		this.e_id = e_id;
		this.salary = salary;
		this.employee_name = employee_name;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", salary=" + salary + ", employee_name=" + employee_name + "]";
	}

}

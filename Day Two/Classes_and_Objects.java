package com.Day2;

//Class And Objects
class Employee {
	String name;
	int eid;
	double salary;

//    Constructor
	public Employee(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	void display() {
		System.out.println("Enter the employee id:" + " " + eid);
		System.out.println("Enter the employee name:" + " " + name);
		System.out.println("Enter the employee Salary:" + " " + salary);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee("Rocky", 1980, 30000);
		obj.display();
	}

}

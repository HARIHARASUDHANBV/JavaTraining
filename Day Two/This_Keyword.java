package com.Day2;

class Keyword {
	String name;
	int eid;
	double salary;

//    Constructor
	public Keyword(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public Keyword() {
		this("Hari", 450, 30000); // Calling the Current class Constructor
		this.display(); // Calling the Method of the Current class
	}

	void display() {
		System.out.println("Enter the employee id:" + " " + eid);
		System.out.println("Enter the employee name:" + " " + name);
		System.out.println("Enter the employee Salary:" + " " + salary);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyword k = new Keyword(); // Calling the non-Parameterized Constructor
	}

}

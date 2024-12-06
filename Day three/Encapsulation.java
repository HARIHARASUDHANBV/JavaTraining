package com.Day3;

//Java Bean Class/Modal Class/PoJo Class
class Teacher {
	private String name;
	private String subject;
	private int salary;

	public Teacher(String name, String subject, int salary) {
		super();
		this.name = name;
		this.subject = subject;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("Julie", "English", 40000);
		t.setName("Julie");
		System.out.println(t.getName());
		t.setName("English");
		System.out.println(t.getSubject());
		t.setSalary(40000);
		System.out.println(t.getSalary());

	}

}

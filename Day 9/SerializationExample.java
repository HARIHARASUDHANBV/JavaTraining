package com.Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings({ "unused", "serial" })
class Bean implements Serializable {
	private String Employee_Name;
	private int id;
	private int Salary;

	public Bean(String employee_Name, int id, int salary) {
		this.Employee_Name = employee_Name;
		this.id = id;
		this.Salary = salary;
	}

	public String getEmployee_Name() {
		return Employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.Employee_Name = employee_Name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}
}

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Serialization
		Bean obj1 = new Bean("Moses", 101, 20000);
		FileOutputStream fos = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		oos.close();
		fos.close();
		// De-Serialization

		FileInputStream fis = new FileInputStream("D://ObjectFile.txt");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Bean obj2 = (Bean) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Employee id" + " " + obj2.getId());
			System.out.println("Employee name" + " " + obj2.getEmployee_Name());
			System.out.println("Employee salary" + " " + obj2.getSalary());
		}

	}

}

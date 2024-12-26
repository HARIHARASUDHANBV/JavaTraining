package com.cms.view;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Represents the view model of the Customer Schema.
 */

import java.util.Scanner;

import com.cms.modal.Customers;
import com.cms.modal.Interactions;

public class CustomersView {
	static Scanner scan = new Scanner(System.in);
	static int customer_Id;
	static String first_Name, last_Name, email, phone_Number, address, status, preferred_Contact, date_Of_Birth,
			registration_Date;
	static Interactions interaction;

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static int menu() {
		System.out.println("1.Insert Customers");
		System.out.println("2.Delete Customers");
		System.out.println("3.Update Customers");
		System.out.println("4.Find Customer");
		System.out.println("5.Find All Customers");
		System.out.println("6.Insert Interactions");
		System.out.println("7.Delete Interaction");
		System.out.println("8.Update Interactions");
		System.out.println("9.Find Interaction");
		System.out.println("10.Find All Interactions");
		System.out.println("11.Exit");

		System.out.println("Enter your Choice:");
		int choice = scan.nextInt();
		return choice;
	}

	public static String toContinue() {
		System.out.println("Do you want to Continue [Yes | No]:");
		String msg = scan.next();
		return msg;
	}

	public static Customers insertCustomersView() {

		System.out.print(
				"Enter Customer ID,FirstName,LastName,email,phone_number,address,date_of_birth,registration_date,status,preferred_Contact");
		customer_Id = scan.nextInt();
		first_Name = scan.next();
		last_Name = scan.next();
		email = scan.next();
		phone_Number = scan.next();
		address = scan.next();
		date_Of_Birth = scan.next();
		registration_Date = scan.next();
		status = scan.next();
		preferred_Contact = scan.next();

		Interactions interaction = new Interactions();
		interaction.setCustomer_Id(customer_Id);

		return new Customers(customer_Id, first_Name, last_Name, email, phone_Number, address, date_Of_Birth,
				registration_Date, status, preferred_Contact, interaction);
	}

	public static int deleteCustomersView() {
		System.out.println("Enter customer_id");

		return scan.nextInt();
	}

	public static Customers updateCustomersView() {
		System.out.print(
				"Enter Customer ID,FirstName,LastName,email,phone_number,address,date_of_birth,registration_date,status,preferred_Contact");
		customer_Id = scan.nextInt();
		first_Name = scan.next();
		last_Name = scan.next();
		email = scan.next();
		phone_Number = scan.next();
		address = scan.next();
		date_Of_Birth = scan.next();
		registration_Date = scan.next();
		status = scan.next();
		preferred_Contact = scan.next();

		Interactions interaction = new Interactions();
		interaction.setCustomer_Id(customer_Id);

		return new Customers(customer_Id, first_Name, last_Name, email, phone_Number, address, date_Of_Birth,
				registration_Date, status, preferred_Contact, interaction);
	}

	public static int findCustomersView() {
		System.out.println("Enter Customers_id");

		return scan.nextInt();
	}
}

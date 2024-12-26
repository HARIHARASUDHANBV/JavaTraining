package com.cms.repository;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Represents the Data-Access-Object for Customer Schema
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.cms.modal.Customers;
import com.cms.modal.Interactions;
import com.cms.util.DBUtility;

public class CustomerRepository implements CustomerInterface {
	InteractionsInterface interactionRepo = new InteractionsRepository();
	int cust_no;

	public boolean doInsertCustomer(Customers customer) {
		boolean flag = false;
		String str = "INSERT INTO Customers (customer_Id,first_name, last_name, email, phone_number, address, date_of_birth, registration_date, status, preferred_contact) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement ps = connection.prepareStatement(str)) {
			ps.setInt(1, customer.getCustomer_Id());
			ps.setString(2, customer.getFirst_Name());
			ps.setString(3, customer.getLast_Name());
			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getPhone_Number());
			ps.setString(6, customer.getAddress());
			ps.setString(7, customer.getDate_Of_Birth());
			ps.setString(8, customer.getRegistration_Date());
			ps.setString(9, customer.getStatus());
			ps.setString(10, customer.getPreferred_Contact());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Insert Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doDeleteCustomer(int id) {
		boolean flag = false;
		String str = "DELETE FROM Customers WHERE customer_id = ?";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement ps = connection.prepareStatement(str)) {

			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete Query not Executed" + " " + e);
		}
		return flag;
	}

	public boolean doUpdateCustomers(Customers customer) {
		boolean flag = false;
		String str = "UPDATE Customers SET phone_number = ? WHERE customer_id = ?";
		try (Connection connection = DBUtility.getDBConnection();
				PreparedStatement ps = connection.prepareStatement(str)) {
			ps.setString(1, customer.getPhone_Number());
			ps.setInt(2, customer.getCustomer_Id());
			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Update Query not executed" + " " + e);
		}
		return flag;

	}

	public Customers doFindCustomer(int id) {
		Customers customers = null;
		try {
			Connection conn = DBUtility.getDBConnection();
			String str = "select * from Customers where customer_id=?";
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				customers = new Customers();
				customers.setCustomer_Id(rs.getInt("customer_Id"));
				customers.setFirst_Name(rs.getString("first_name"));
				customers.setLast_Name(rs.getString("last_name"));
				customers.setEmail(rs.getString("email"));
				customers.setPhone_Number(rs.getString("phone_number"));
				customers.setAddress(rs.getString("address"));
				customers.setDate_Of_Birth(rs.getString("date_of_birth"));
				customers.setRegistration_Date(rs.getString("registration_date"));
				customers.setStatus(rs.getString("status"));
				customers.setPreferred_Contact(rs.getString("preferred_contact"));
				cust_no = rs.getInt("customer_id");
				Interactions interaction = interactionRepo.getInteractions(cust_no);
				customers.setInteraction(interaction);
			}

		} catch (SQLException e) {
			System.out.println("Find Query not executed" + " " + e);
		}
		return customers;
	}

	public List<Customers> doFindAllCustomers() {
		List<Customers> list = new LinkedList<Customers>();

		try {
			Connection connection = DBUtility.getDBConnection();
			String str = "SELECT * FROM Customers";
			PreparedStatement statement = connection.prepareStatement(str);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				Customers customer = new Customers();
				customer.setFirst_Name(rs.getString("first_name"));
				customer.setLast_Name(rs.getString("last_name"));
				customer.setEmail(rs.getString("email"));
				customer.setPhone_Number(rs.getString("phone_number"));
				customer.setAddress(rs.getString("address"));
				customer.setDate_Of_Birth(rs.getString("date_of_birth"));
				customer.setRegistration_Date(rs.getString("registration_date"));
				customer.setStatus(rs.getString("status"));
				customer.setPreferred_Contact(rs.getString("preferred_contact"));
				cust_no = rs.getInt("customer_id");
				Interactions interaction = interactionRepo.getInteractions(cust_no);
				customer.setInteraction(interaction);
				list.add(customer);
			}
		} catch (SQLException e) {
			System.out.println("FindAll Query not executed" + " " + e);
		}
		return list;
	}
}

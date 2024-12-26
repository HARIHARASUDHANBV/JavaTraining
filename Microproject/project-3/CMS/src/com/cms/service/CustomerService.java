package com.cms.service;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Represents the Service layer of the Customer schema.
 */
import com.cms.modal.Customers;
import com.cms.repository.CustomerInterface;
import com.cms.repository.CustomerRepository;

public class CustomerService implements CustomerServiceInterface {
	CustomerInterface customerRepo = new CustomerRepository();

	public String insertCustomerValidation(Customers customer) {
		String result;
		if (customer == null) {
			result = "Customer Object is null";
		} else if (customer.getCustomer_Id() == 0 || customer.getFirst_Name() == null || customer.getLast_Name() == null
				|| customer.getEmail() == null || customer.getPhone_Number() == null || customer.getAddress() == null
				|| customer.getDate_Of_Birth() == null || customer.getRegistration_Date() == null
				|| customer.getStatus() == null || customer.getPreferred_Contact() == null) {
			result = "Invalid Customer data";
		} else {
			boolean flag = customerRepo.doInsertCustomer(customer);
			if (flag) {
				result = "Customer_Object_saved";
			} else {
				result = "Customer_Object_not_saved";
			}
		}
		return result;
	}

	public String deleteCustomerValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = customerRepo.doDeleteCustomer(id);
			if (flag) {
				result = "Customer_Object_Deleted";
			} else {
				result = "Customer_Object_Not_Found";
			}

		}
		return result;
	}

	public String updateCustomerValidation(Customers customer) {
		String result;
		if (customer == null) {
			result = "Customer Object is null";
		} else if (customer.getCustomer_Id() == 0 || customer.getFirst_Name() == null || customer.getLast_Name() == null
				|| customer.getEmail() == null || customer.getPhone_Number() == null || customer.getAddress() == null
				|| customer.getDate_Of_Birth() == null || customer.getRegistration_Date() == null
				|| customer.getStatus() == null || customer.getPreferred_Contact() == null) {
			result = "Invalid Customer data";
		} else {
			boolean flag = customerRepo.doUpdateCustomers(customer);
			if (flag) {
				result = "Customer_Object_updated";
			} else {
				result = "Customer_Object_not_found";
			}
		}
		return result;
	}

	public String findCustomerValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Customers customer = customerRepo.doFindCustomer(id);
			if (customer != null) {
				result = customer.toString();
			} else {
				result = "Customer_Object_Not_Found";
			}

		}
		return result;
	}

	public String findAllCustomersValidation() {
		return customerRepo.doFindAllCustomers().toString();
	}

}

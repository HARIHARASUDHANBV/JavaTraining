package com.cms.service;

import com.cms.modal.Customers;

/**
 * @author HARIHARASUDHAN B V
 * @version 1.0 
 * Interface to promote abstraction of the service layer for
 *          Customers.
 */
public interface CustomerServiceInterface {
	public String insertCustomerValidation(Customers customer);

	public String deleteCustomerValidation(int id);

	public String updateCustomerValidation(Customers customer);

	public String findCustomerValidation(int id);

	public String findAllCustomersValidation();
}

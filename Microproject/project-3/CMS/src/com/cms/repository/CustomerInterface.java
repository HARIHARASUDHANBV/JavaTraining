package com.cms.repository;
/**
 * @author HARIHARASUDHAN B V
 * @version 1.0
 * Interface to promote abstraction of the DAO(Data-Access Object) of Customer.
 */
import java.util.List;

import com.cms.modal.Customers;

public interface CustomerInterface {

	public boolean doInsertCustomer(Customers customer);

	public boolean doDeleteCustomer(int id);

	public boolean doUpdateCustomers(Customers customer);

	public Customers doFindCustomer(int id);

	public List<Customers> doFindAllCustomers();
}

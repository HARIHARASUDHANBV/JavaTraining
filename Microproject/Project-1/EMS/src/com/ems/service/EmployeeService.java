package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;

/**
 * @author HARIHARASUDHAN.B.V
 * @version 1.0 Service Layer of the Employee Management System.
 */
public class EmployeeService {
	// EmployeeRepo employeeRepo = new EmployeeRepo();
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	/**
	 * 
	 * @param employee
	 * @return String. It validates the data being entered into the specified
	 *         Collection.
	 */
	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getE_id() == 0 || employee.getEmployee_name() == null || employee.getSalary() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
			if (flag) {
				result = "Employee_Object_saved";
			} else {
				result = "Employee_Object_not_saved";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String. It checks and removes the specified value from the
	 *         Collection.
	 */
	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee_Object_Deleted";
			} else {
				result = "Employee_Object_Not_Found";
			}

		}
		return result;
	}

	/**
	 * 
	 * @param employee
	 * @return String. It updates the specified collection.
	 */
	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getE_id() == 0 || employee.getEmployee_name() == null || employee.getSalary() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
			if (flag) {
				result = "Employee_Object_updated";
			} else {
				result = "Employee_Object_not_found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String. It retrieves and displays the specified detail.
	 */
	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee_Object_Not_Found";
			}

		}
		return result;
	}

	/**
	 * 
	 * @return String. It displays the details of all the Employees in the
	 *         Collection.
	 */
	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}
}

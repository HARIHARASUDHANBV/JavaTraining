package com.ems.service;

import com.ems.modal.Employee;

import com.ems.repo.EmployeeRepo1;

public class EmployeeService {
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0
				|| employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
			if (flag) {
				result = "Employee_Object_saved";
			} else {
				result = "Employee_Object_not_saved";
			}
		}
		return result;
	}

	public String deleteEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
			if (flag) {
				result = "Employee_Object_Deleted";
			} else {
				result = "Employee_Object_Not_Found";
			}

		}
		return result;
	}

	public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0
				|| employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee data";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);
			if (flag) {
				result = "Employee_Object_updated";
			} else {
				result = "Employee_Object_not_found";
			}
		}
		return result;
	}

	public String findEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee_Object_Not_Found";
			}

		}
		return result;
	}

	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAllEmployee().toString();
	}

}

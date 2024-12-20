package com.ems.repo;

import java.util.Iterator;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author HARIHARASUDHAN.B.V
 * @version 1.0. It is performing all the operations on List Collection.
 */
public class EmployeeRepo {
	/**
	 * 
	 * @param employee
	 * @return boolean. Business logic for Insertion on List Database Employee
	 */
	public boolean doInsert(Employee employee) {
		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee);
	}

	/**
	 * 
	 * @param id
	 * @return boolean. Business logic for Deletion on List Database Employee
	 */
	public boolean doDelete(int id) {
		boolean flag = false;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getE_id() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean. Business logic for updating the List Database Employee
	 */
	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getE_id() == employee.getE_id()) {
				list.set(index, employee);
				flag = true;
				break;
			}
			index++;
		}
		return flag;
	}

	/**
	 * 
	 * @param id
	 * @return Employee. Business logic for finding the element in the List
	 *         database.
	 */
	public Employee doFind(int id) {
		Employee employee = null;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getE_id() == id) {
				employee = temp;
				break;
			}
		}
		return employee;
	}

	/**
	 * 
	 * @return List<Employee>. Business logic for displaying the details for all the
	 *         Employees in the Specified List Collection
	 */
	public List<Employee> doFindAll() {
		return DBUtil.getListDBInstance();
	}
}

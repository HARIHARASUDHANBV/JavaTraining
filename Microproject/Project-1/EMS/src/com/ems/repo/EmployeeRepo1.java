package com.ems.repo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * 
 * @author HARIHARASUDHAN.B.V
 * @Version 1.0 .It is performing all the operations on Map DB.
 */
public class EmployeeRepo1 {
	/**
	 * 
	 * @param employee
	 * @return boolean. It is performing the insertion into the Map Database
	 *         Employee.
	 */
	public boolean doInsert(Employee employee) {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getE_id(), employee);
		return true;
	}

	/**
	 * 
	 * @param id
	 * @return boolean. Its performing deletion operation on the Map Database
	 *         Employee
	 */
	public boolean doDelete(int id) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			map.remove(id);
			flag = true;
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean. Its performing updation in the Map Database Employee
	 */
	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getE_id())) {
			map.put(employee.getE_id(), employee);
			flag = true;
		}
		return flag;
	}

	/**
	 * 
	 * @param id
	 * @return Employee. Its performing Finding the Employee id from Map Database.
	 */
	public Employee doFind(int id) {
		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;
	}

	/**
	 * 
	 * @return List<Employee>. It finds all the Employee details stored in Map
	 *         Collection.
	 */

	public List<Employee> doFindAll() {
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<Employee>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;
	}
}

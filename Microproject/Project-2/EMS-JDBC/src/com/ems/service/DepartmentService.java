package com.ems.service;

import com.ems.modal.Department;
import com.ems.repo.DepartmentRepo;

public class DepartmentService {
	DepartmentRepo departmentRepo = new DepartmentRepo();

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Department data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Department_Object_saved";
			} else {
				result = "Department_Object_not_saved";
			}
		}
		return result;
	}

	public String deleteDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department_Object_Deleted";
			} else {
				result = "Department_Object_Not_Found";
			}

		}
		return result;
	}

	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Department data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department_Object_updated";
			} else {
				result = "Department_Object_not_found";
			}
		}
		return result;
	}

	public String findDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department_Object_Not_Found";
			}

		}
		return result;
	}

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}

package com.hcl.swipe.repository;

import java.util.List;

import com.hcl.swipe.model.Employee;

public interface EmployeeRepo {
	  List<Employee> findAll();
	    int save(Employee employee);
	    int update(Employee employee);
}

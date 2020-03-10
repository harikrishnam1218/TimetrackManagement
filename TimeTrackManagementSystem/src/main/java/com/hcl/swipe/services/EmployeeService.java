package com.hcl.swipe.services;

import java.util.List;

import javax.validation.Valid;

import com.hcl.swipe.model.Employee;
import com.hcl.swipe.model.EmployeeTimeTrack;

public interface EmployeeService {

	List<Employee> fetchEmployees();
	int saveEmployee(Employee employee);
	int updateEmployee(Employee employee);
	int updateTimeTrack(EmployeeTimeTrack employeeTimeTrack);
}

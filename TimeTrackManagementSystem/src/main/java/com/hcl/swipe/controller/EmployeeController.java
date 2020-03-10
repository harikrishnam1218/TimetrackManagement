package com.hcl.swipe.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.swipe.model.Employee;
import com.hcl.swipe.model.EmployeeTimeTrack;
import com.hcl.swipe.services.EmployeeService;
import com.hcl.swipe.services.EmployeeTimeTrackService;

@RestController
//@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeTimeTrackService employeeTimeTrackser;
	
	@GetMapping(value="/list")
	public ResponseEntity<List<Employee>> employeDetails() {
		List<Employee> list=employeeService.fetchEmployees();
		return new ResponseEntity(list, HttpStatus.OK);
		//return list;
	}
	@PostMapping(value="/saveTimeTrack")
	public int saveEmployeeTimeTrack(@Valid @RequestBody EmployeeTimeTrack employeeTimeTrack){
		return employeeTimeTrack.saveTimeTrack(employeeTimeTrack);
	}
	
	@PutMapping(value="/updateTimeTrack")
	public int updateEmployeeTimeTrack(@Valid @RequestBody EmployeeTimeTrack employeeTimeTrack){
		return employeeTimeTrack.updateTimeTrack(employeeTimeTrack);
	}
	
	@PostMapping(value="/saveEmployee")
	public int saveEmployee(@Valid @RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping(value="/updateEmployee")
	public int updateEmployee(@Valid @RequestBody Employee employee){
		return employeeService.updateEmployee(employee);
	}
	@GetMapping(value="/listTimeTracks")
	public ResponseEntity<List<Employee>> timeTracks() {
		List<Employee> list=employeeTimeTrack.fetchEmployees();
		return new ResponseEntity(list, HttpStatus.OK);
		//return list;
	}
	
	@GetMapping(value="/timeTracks/eid")
	public ResponseEntity<List<EmployeeTimeTrack>> timeTracksOfEmployee(Long eid) {
		List<EmployeeTimeTrack> list=employeeTimeTrack.fetchtimeTracksOfEmployee(eid);
		return new ResponseEntity(list, HttpStatus.OK);
		//return list;
	}
	
}

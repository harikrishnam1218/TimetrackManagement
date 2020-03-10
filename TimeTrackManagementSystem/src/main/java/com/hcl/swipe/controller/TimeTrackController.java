package com.hcl.swipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.swipe.services.EmployeeTimeTrackService;

@RestController
@RequestMapping(value="/timetrack")
public class TimeTrackController {
	@Autowired
	private EmployeeTimeTrackService employeeTimeTrackService;
	
}

package com.employee.employee_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee_service.services.EmployeeService;

@RestController

public class EmployeeController {
    
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public String index() {
		return null;
	}
}

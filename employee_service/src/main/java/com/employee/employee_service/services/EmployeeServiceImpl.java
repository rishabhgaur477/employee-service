package com.employee.employee_service.services;

import org.springframework.stereotype.Service;

import com.employee.employee_service.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeDetails(String eId) {
		
		return new Employee("Rishabh", "Gaur", null, null, "101");
	}

}

package com.springbootwithjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithjpa.model.Employee;
import com.springbootwithjpa.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(value="/create")
    public Employee createOperation(@RequestBody Employee employee)
    {
    	return this.employeeService.createEmployee(employee);
    }
	
	@GetMapping(value="/readbyid/{abc}")
    public Employee readOperation(@PathVariable("abc") int empId)
    {
    	return this.employeeService.readEmployeeById(empId);
    }
	
	
	@GetMapping(value="/readbyall")
    public List<Employee> readAllOperation()
    {
    	return this.employeeService.getAllEmployee();
    }
}

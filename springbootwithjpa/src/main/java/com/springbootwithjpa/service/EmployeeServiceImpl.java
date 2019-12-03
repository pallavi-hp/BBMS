package com.springbootwithjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootwithjpa.dao.EmployeeRepository;
import com.springbootwithjpa.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		
		return this.employeeRepository.findByEmpId(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		
		return null;
	}
	
	@Override
	public List<Employee> getAllEmployee(){
		
		return this.employeeRepository.findAll();
	}

}

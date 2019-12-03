package com.springbootwithjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootwithjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{
	public Employee findByEmpId(int empId);
	
	public List<Employee> findAll();

}

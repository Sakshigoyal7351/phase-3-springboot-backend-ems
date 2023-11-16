package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	public void updateEmployee(Employee emp, int eid);
	
	public void deleleEmployee(int eid);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int eid);
}

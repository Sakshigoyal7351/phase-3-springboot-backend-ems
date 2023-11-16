package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void addEmployee(Employee emp) {
		
		employeeRepository.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp, int eid) {
		employeeRepository.save(emp);
		
	}

	@Override
	public void deleleEmployee(int eid) {
		employeeRepository.deleteById(eid);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int eid) {
		return employeeRepository.findById(eid).get();
		
	}

	
}

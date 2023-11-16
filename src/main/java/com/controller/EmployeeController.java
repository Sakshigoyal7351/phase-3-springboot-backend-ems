package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
//	@GetMapping("/test")
	@RequestMapping(method=RequestMethod.GET, value="/test")
	public String demo()
	{
		return "project is working fine !!";
	}
	
//	@PostMapping("/employee")
	@RequestMapping(method=RequestMethod.POST, value="/employee")
	public void addEmployee(@RequestBody Employee emp)
	{
		employeeService.addEmployee(emp);
	}
	
	@PutMapping("/employee/{eid}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable int eid)
	{
		employeeService.updateEmployee(emp, eid);
	}
	
	@DeleteMapping("/employee/{eid}")
	public void deleteEmployee(@PathVariable int eid)
	{
		employeeService.deleleEmployee(eid);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{eid}")
	public Employee getEmployee(@PathVariable  int eid)
	{
		return employeeService.getEmployeeById(eid);
	}
	
	
	
	
	
	
}

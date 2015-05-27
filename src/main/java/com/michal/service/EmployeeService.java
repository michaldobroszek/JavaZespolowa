package com.michal.service;

import java.util.List;

import com.michal.model.Employee;

public interface EmployeeService {
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int idEmployee);
	public Employee getEmployee(int idEmployee);
	public List getAllEmployee();


}

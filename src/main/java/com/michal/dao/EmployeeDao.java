package com.michal.dao;

import java.util.List;

import com.michal.model.Employee;

public interface EmployeeDao {
	public void add(Employee employee);
	public void edit(Employee employee);
	public void delete(int idEmployee);
	public Employee getEmployee(int idEmployee);
	public List getAllEmployee();

}

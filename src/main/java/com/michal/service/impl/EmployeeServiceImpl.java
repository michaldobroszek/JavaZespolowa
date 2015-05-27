package com.michal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.michal.dao.EmployeeDao;
import com.michal.model.Employee;
import com.michal.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void add(Employee employee) {
		employeeDao.add(employee);
	}

	@Transactional
	public void edit(Employee employee) {
		employeeDao.edit(employee);

	}

	@Transactional
	public void delete(int idEmployee) {
		employeeDao.delete(idEmployee);

	}

	@Transactional
	public Employee getEmployee(int idEmployee) {
		
		return employeeDao.getEmployee(idEmployee);
	}

	@Transactional
	public List getAllEmployee() {
		
		return employeeDao.getAllEmployee();
	}

}

package com.michal.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.michal.dao.EmployeeDao;
import com.michal.model.Employee;
import com.michal.model.Student;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Employee employee) {
		session.getCurrentSession().save(employee);

	}

	@Override
	public void edit(Employee employee) {
		session.getCurrentSession().update(employee);

	}

	@Override
	public void delete(int idEmployee) {
		session.getCurrentSession().delete(getEmployee(idEmployee));

	}

	@Override
	public Employee getEmployee(int idEmployee) {
		return (Employee)session.getCurrentSession().get(Employee.class, idEmployee);
	}

	@Override
	public List getAllEmployee() {
		return session.getCurrentSession().createQuery("from Employee").list();
	}

}

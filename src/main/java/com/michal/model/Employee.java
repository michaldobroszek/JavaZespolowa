package com.michal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEmployee;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private float salary;
	@Column 
	private String position;
	public Employee(int idEmployee, String firstname, String lastname,
			float salary, String position) {
		super();
		this.idEmployee = idEmployee;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.position = position;
	}
	public Employee() {
		
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

}

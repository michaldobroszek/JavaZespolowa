package com.michal.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.michal.model.Employee;
import com.michal.model.Student;
import com.michal.service.EmployeeService;
import com.michal.service.StudentService;
@Controller
public class SpringController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map){
		Student student = new Student();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	@RequestMapping(value="/student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Student studentResult = new Student();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getStudentId());
			studentResult = new Student();
			break;
		case "search":
			Student searchedStudent = studentService.getStudent(student.getStudentId());
			studentResult = searchedStudent!=null ? searchedStudent : new Student();
			break;
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping("/main")
	public String setupForm2(){
		
		return "main";
		
	}
	
	
	@RequestMapping("/employee")
	public String setupFormEmployee(Map<String, Object> map){
		Employee employee = new Employee();
		map.put("employee", employee);
		map.put("employeeList", employeeService.getAllEmployee());
		return "employee";
	}
	
	@RequestMapping(value="/employee.do", method=RequestMethod.POST)
	public String doActions2(@ModelAttribute Employee employee, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Employee employeeResult = new Employee();
		switch(action.toLowerCase()){	//only in Java7 you can put String in switch
		case "add":
			employeeService.add(employee);
			employeeResult = employee;
			break;
		case "edit":
			employeeService.edit(employee);
			employeeResult = employee;
			break;
		case "delete":
			employeeService.delete(employee.getIdEmployee());
			employeeResult = new Employee();
			break;
		case "search":
			Employee searchedEmployee = employeeService.getEmployee(employee.getIdEmployee());
			employeeResult = searchedEmployee!=null ? searchedEmployee : new Employee();
			break;
		}
		map.put("employee", employeeResult);
		map.put("employeeList", employeeService.getAllEmployee());
		return "employee";
	}
}

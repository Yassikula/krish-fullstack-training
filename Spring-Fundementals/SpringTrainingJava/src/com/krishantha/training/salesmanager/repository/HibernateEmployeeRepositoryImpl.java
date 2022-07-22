package com.krishantha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.krishantha.training.salesmanager.model.Employee;

@Repository("myDatabase")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Value("${name}")
	private String employeeName;
	
	@Value("${city}")
	private String employeeCity;
	
	
	

@Override
public List<Employee> getAllEmployees() {
	System.out.println("hit");
	List<Employee> employees = new ArrayList<>();
	Employee employee = new Employee();
	employee.setEmployeeLocation("Krish");
	employee.setEmployeeName("Kadawatha");
	employees.add(employee);
	return employees;
	}
}

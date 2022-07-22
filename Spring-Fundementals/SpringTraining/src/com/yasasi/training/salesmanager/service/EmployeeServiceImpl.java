package com.yasasi.training.salesmanager.service;

import java.util.List;

import com.yasasi.training.salesmanager.model.Employee;
import com.yasasi.training.salesmanager.repository.EmployeeRepository;
import com.yasasi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository emplployeeRepository = new HibernateEmployeeRepositoryImpl();

	public List<Employee> getAllEmployees(){
		return emplployeeRepository.getAllEmployees();
	}
}

package com.yasasi.training.salesmanager.repository;

import java.util.List;

import com.yasasi.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}
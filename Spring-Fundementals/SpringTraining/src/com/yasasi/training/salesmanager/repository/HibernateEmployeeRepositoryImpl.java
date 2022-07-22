package com.yasasi.training.salesmanager.repository;

import java.util.List;
import java.util.ArrayList;

import com.yasasi.training.salesmanager.model.*;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	   @Override
	public List<Employee> getAllEmployees(){
		   
	        List<Employee> employeeList = new ArrayList<>();
	        Employee employee = new Employee();
	        employee.setEmployeeName("Yasasi");
	        employee.setEmployeeLocation("Kulathunge");
	        employeeList.add(employee);
	        return employeeList;
	    }

}

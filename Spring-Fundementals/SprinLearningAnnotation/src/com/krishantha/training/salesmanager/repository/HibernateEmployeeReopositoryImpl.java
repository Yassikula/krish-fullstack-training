package com.krishantha.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishantha.training.salesmanager.model.Employee;


@Repository("employeeRespository") 
public class HibernateEmployeeReopositoryImpl {
	
	  public List<Employee> getAllEmployees(){
	        List<Employee> employeeList = new ArrayList<>();
	        Employee employee = new Employee();
	        employee.setEmployeeName("Chanuka");
	        employee.setEmployeeLocation("Homagama");
	        employeeList.add(employee);
	        return employeeList;

}
}

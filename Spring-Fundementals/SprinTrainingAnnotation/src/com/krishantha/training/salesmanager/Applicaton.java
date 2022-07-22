package com.krishantha.training.salesmanager;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;

public class Applicaton {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		  EmployeeService service = applicationContext.getBean("employeeService", EmployeeService.class);
	        List<Employee> employeeList = service.getAllEmployees();
		 employeeList.forEach(employee->{
	            System.out.println(employee.getEmployeeName() +" at "+employee.getEmployeeLocation());
		  });
	}
}

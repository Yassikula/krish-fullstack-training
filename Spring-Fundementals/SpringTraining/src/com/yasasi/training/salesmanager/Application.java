package com.yasasi.training.salesmanager;

import java.util.List;

import com.yasasi.training.salesmanager.model.Employee;
import com.yasasi.training.salesmanager.service.EmployeeService;
import com.yasasi.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
//		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employees = employeeService.getAllEmployees();
       for(Employee employee : employees){
            System.out.println(employee.getEmployeeName() +" at "+employee.getEmployeeLocation());
        
	}
	}

}

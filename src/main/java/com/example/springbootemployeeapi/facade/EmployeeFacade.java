package com.example.springbootemployeeapi.facade;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;

public interface EmployeeFacade {

	List<Employee> getAllEmployee();

	Employee updateEmployee(long employeeCode, Employee employee);

	Employee newEmployee(Employee employee);

	Employee getEmployee(long employeeCode);

	void deleteEmployee(long employeeCode);

}
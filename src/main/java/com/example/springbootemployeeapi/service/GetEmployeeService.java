package com.example.springbootemployeeapi.service;

import java.util.List;

import com.example.springbootemployeeapi.model.Employee;

public interface GetEmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployee(long employeeCode);

}
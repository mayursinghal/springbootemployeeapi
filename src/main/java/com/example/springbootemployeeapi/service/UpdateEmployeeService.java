package com.example.springbootemployeeapi.service;

import com.example.springbootemployeeapi.model.Employee;

public interface UpdateEmployeeService {

	Employee updateEmployee(long employeeCode, Employee employee);

}
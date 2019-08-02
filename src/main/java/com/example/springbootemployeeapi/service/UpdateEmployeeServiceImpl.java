package com.example.springbootemployeeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;
import com.example.springbootemployeeapi.repository.UpdateEmployeeRepository;

@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {
	@Autowired
	private UpdateEmployeeRepository updateEmployeeRepository;
	/* (non-Javadoc)
	 * @see com.nagarro.employeeapi.service.UpdateEmployeeService#updateEmployee(long, com.nagarro.employeeapi.model.Employee)
	 */
	@Override
	public Employee updateEmployee(long employeeCode, Employee employee) {
		System.out.println("13");
		Employee oldEmployee = updateEmployeeRepository.findById(employeeCode).get();
		oldEmployee.setDob(employee.getDob());
		oldEmployee.setEmail(employee.getEmail());
		oldEmployee.setEmployeeCode(employee.getEmployeeCode());
		oldEmployee.setEmployeeName(employee.getEmployeeName());
		oldEmployee.setLocation(employee.getLocation());
		
		updateEmployeeRepository.save(employee);
		return oldEmployee;
	}
}

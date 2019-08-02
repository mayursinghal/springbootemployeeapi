package com.example.springbootemployeeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;
import com.example.springbootemployeeapi.repository.AddEmployeeRepository;

@Service
public class AddEmployeeServiceImpl implements AddEmployeeService {
	@Autowired
	private AddEmployeeRepository addEmployeeRepository;
		
	/* (non-Javadoc)
	 * @see com.nagarro.employeeapi.service.AddEmployeeService#newEmployee(com.nagarro.employeeapi.model.Employee)
	 */
	@Override
	public Employee newEmployee(Employee employee) {
		System.out.println("3");
		// TODO Auto-generated method stub
		return addEmployeeRepository.save(employee);
	}
}

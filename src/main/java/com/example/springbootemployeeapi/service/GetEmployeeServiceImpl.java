package com.example.springbootemployeeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;
import com.example.springbootemployeeapi.repository.GetEmployeeRepository;

@Service
public class GetEmployeeServiceImpl implements GetEmployeeService {
	@Autowired
	private GetEmployeeRepository employeeRepository;

	/* (non-Javadoc)
	 * @see com.nagarro.employeeapi.service.GetEmployeeService#getAllEmployee()
	 */
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.nagarro.employeeapi.service.GetEmployeeService#getEmployee(long)
	 */
	@Override
	public Employee getEmployee(long employeeCode) {
		Employee employee = employeeRepository.getOne(employeeCode);
		return employee;
	}

}

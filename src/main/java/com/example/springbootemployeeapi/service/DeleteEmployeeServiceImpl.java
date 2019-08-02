package com.example.springbootemployeeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;
import com.example.springbootemployeeapi.repository.DeleteEmployeeRepository;

@Service
public class DeleteEmployeeServiceImpl implements DeleteEmployeeService {
	@Autowired
	private DeleteEmployeeRepository deleteEmployeeRepository;
	/* (non-Javadoc)
	 * @see com.nagarro.employeeapi.service.DeleteEmployeeService#deleteEmployee(long)
	 */
	@Override
	public void deleteEmployee(long employeeCode) {
		deleteEmployeeRepository.deleteById(employeeCode);
	}
}

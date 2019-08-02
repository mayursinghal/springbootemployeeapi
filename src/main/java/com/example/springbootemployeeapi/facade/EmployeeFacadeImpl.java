package com.example.springbootemployeeapi.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootemployeeapi.model.Employee;
import com.example.springbootemployeeapi.service.AddEmployeeService;
import com.example.springbootemployeeapi.service.DeleteEmployeeService;
import com.example.springbootemployeeapi.service.GetEmployeeService;
import com.example.springbootemployeeapi.service.UpdateEmployeeService;

@Service
public class EmployeeFacadeImpl implements EmployeeFacade {
	@Autowired
	private AddEmployeeService addEmployeeService;
	@Autowired
	private GetEmployeeService getEmployeeService;
	@Autowired
	private UpdateEmployeeService updateEmployeeService;
	@Autowired
	private DeleteEmployeeService deleteEmployeeService;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return getEmployeeService.getAllEmployee();
	}
	@Override
	public Employee updateEmployee(long employeeCode, Employee employee) {
		System.out.println("12");
		return updateEmployeeService.updateEmployee(employeeCode, employee);
	}

	@Override
	public Employee newEmployee(Employee employee) {
		System.out.println("2");
		//Employee specificEmployee = getEmployeeService.getEmployee(employee.getEmployeeCode());
		return addEmployeeService.newEmployee(employee);
		
	}

	@Override
	public Employee getEmployee(long employeeCode) {
		return getEmployeeService.getEmployee(employeeCode);
	}
	@Override
	public void deleteEmployee(long employeeCode) {
		 deleteEmployeeService.deleteEmployee(employeeCode);
		
	}
	
}

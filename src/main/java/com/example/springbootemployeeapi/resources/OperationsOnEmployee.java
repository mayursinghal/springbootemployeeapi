package com.example.springbootemployeeapi.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootemployeeapi.facade.EmployeeFacade;
import com.example.springbootemployeeapi.model.Employee;

@RestController
@RequestMapping(value="operationsOnEmployee")
public class OperationsOnEmployee {
	
	@Autowired
	EmployeeFacade employeeFacade;
		
	
	@GetMapping(produces = "application/json")
	public List<Employee> getEmployee() {
		return employeeFacade.getAllEmployee();
	}
	
	@GetMapping(value= "/{employeeCode}", produces = "application/json")
	public Employee specificEmployee(@PathParam("employeeCode") long employeeCode)
	{
		return employeeFacade.getEmployee(employeeCode);
	}
	
	@PostMapping(produces = "application/json" ,consumes = "application/json")
	public Response addEmployee(@RequestBody Employee employee)
	{	
		System.out.println("1");
		Employee emp = employeeFacade.newEmployee(employee);
		return Response.status(201).entity(emp).build();
		
		//return employeeService.newEmployee(employee);
	}
	/*@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Employee addEmployee( Employee employee)
	{
	    System.out.println(employee);
	    return employeeFacade.newEmployee(employee);
	}*/
	
	@PutMapping(value= "/{employeeCode}", produces = "application/json",consumes = "application/json")
	public Employee updateEmployee(@PathVariable("employeeCode") long employeeCode, @RequestBody Employee employee)
	{
		System.out.println("11");
		employee.setEmployeeCode(employeeCode);
		
		return employeeFacade.updateEmployee(employeeCode,employee);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{employeeCode}")
	public void deleteEmployee(@PathParam("employeeCode") long employeeCode)
	{
		 employeeFacade.deleteEmployee(employeeCode);
	}
}

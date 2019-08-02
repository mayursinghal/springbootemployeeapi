package com.example.springbootemployeeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootemployeeapi.model.Employee;

public interface GetEmployeeRepository extends JpaRepository<Employee,Long> {


}
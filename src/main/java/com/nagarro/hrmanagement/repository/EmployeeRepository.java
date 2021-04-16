package com.nagarro.hrmanagement.repository;

import java.util.List;

import com.nagarro.hrmanagement.model.Employee;

public interface EmployeeRepository {

    public List<Employee> getAllEmployees();

    void addEmployee(Employee employee);

    void addAllEmployees(List<Employee> employees);

    void editEmployee(Employee employee);
}

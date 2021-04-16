/*
* Class name: EmployeeRepository
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 13/Apr/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 16/Apr/2021
*
* Description: Employee Repository
*/
package com.nagarro.hrmanagement.repository;

import java.util.List;

import com.nagarro.hrmanagement.model.Employee;

public interface EmployeeRepository {

    /**
     * @return list of all employees
     */
    public List<Employee> getAllEmployees();

    /**
     * add an employee
     * 
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * add employees
     * 
     * @param employees
     */
    void addAllEmployees(List<Employee> employees);

    /**
     * edit an employee
     * 
     * @param employee
     */
    void editEmployee(Employee employee);
}

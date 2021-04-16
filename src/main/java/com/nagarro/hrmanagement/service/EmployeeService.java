/*
* Class name: EmployeeService
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
* Description: Employee Service
*/
package com.nagarro.hrmanagement.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.supercsv.io.ICsvBeanWriter;

import com.nagarro.hrmanagement.model.Employee;

public interface EmployeeService {

    /**
     * @return list of employees
     */
    List<Employee> getAllEmployees();

    /**
     * add employees to csv file
     * 
     * @param csvBeanWriter
     * @throws IOException
     */
    void addEmployeeDetailsToFile(ICsvBeanWriter csvBeanWriter) throws IOException;

    /**
     * add employee to csv
     * 
     * @param file
     */
    void addAllEmployees(MultipartFile file);

    /**
     * edit an employee
     * 
     * @param employee
     */
    void editEmployee(Employee employee);
}

package com.nagarro.hrmanagement.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.supercsv.io.ICsvBeanWriter;

import com.nagarro.hrmanagement.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void addEmployeeDetailsToFile(ICsvBeanWriter csvBeanWriter) throws IOException;

    void addAllEmployees(MultipartFile file);

    void editEmployee(Employee employee);
}

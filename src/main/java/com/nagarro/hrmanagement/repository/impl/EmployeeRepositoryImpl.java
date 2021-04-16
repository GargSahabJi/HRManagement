package com.nagarro.hrmanagement.repository.impl;

import com.nagarro.hrmanagement.model.Employee;
import com.nagarro.hrmanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        ResponseEntity<Employee[]> response = restTemplate
                .getForEntity("http://localhost:8080//employee-api/employees/", Employee[].class);
        Employee[] employees = response.getBody();
        return Arrays.asList(employees);
    }

    @Override
    public void addEmployee(Employee employee) {
        String url = "http://localhost:8080/employee-api/employees";
        restTemplate.postForObject(url, employee, Employee.class);
    }

    @Override
    public void addAllEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeCode() + " " + employee.getEmployeeName());
            this.addEmployee(employee);
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        String url = "http://localhost:8080/employee-api/employees/" + employee.getEmployeeCode();
        System.out.println(url);
        restTemplate.put(url, employee);
    }
}

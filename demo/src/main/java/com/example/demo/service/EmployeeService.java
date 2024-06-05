package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getByEmployeeId(String id);

    String deleteEmployeeById(String id);
}

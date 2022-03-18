package org.example.services;

import org.example.entities.Employee;

import java.util.List;

public interface EmployeeService {
    void insert(Employee employee);

    void update(Employee employee);

    void delete(Integer passportNumber);

    Employee getBy(Integer passportNumber);

    List<Employee> getAll();
}

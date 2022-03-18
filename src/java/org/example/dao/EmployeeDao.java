package org.example.dao;

import org.example.entities.Employee;

import java.util.List;

public interface EmployeeDao {
    void delete(Integer passportNumber);

    void insert(Employee employee);

    Employee getBy(Integer passportNumber);

    List getAll();

    void update(Employee employee);
}

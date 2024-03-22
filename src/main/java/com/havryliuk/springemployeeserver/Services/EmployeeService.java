package com.havryliuk.springemployeeserver.Services;

import com.havryliuk.springemployeeserver.Entityes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    void deleteEmployee(int id);

    Employee saveEmployee(Employee employee);
}



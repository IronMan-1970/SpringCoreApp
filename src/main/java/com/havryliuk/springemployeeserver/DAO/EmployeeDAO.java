package com.havryliuk.springemployeeserver.DAO;

import com.havryliuk.springemployeeserver.Entityes.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteEmployee(int id);

    Employee saveEmployee(Employee employee);
}

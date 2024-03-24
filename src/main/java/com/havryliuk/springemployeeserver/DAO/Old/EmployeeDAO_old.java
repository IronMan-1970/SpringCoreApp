package com.havryliuk.springemployeeserver.DAO.Old;

import com.havryliuk.springemployeeserver.Entityes.Employee;

import java.util.List;

public interface EmployeeDAO_old {

    List<Employee> findAll();

    Employee findById(int id);

    void deleteEmployee(int id);

    Employee saveEmployee(Employee employee);
}

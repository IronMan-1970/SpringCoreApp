package com.havryliuk.springemployeeserver.Services;

import com.havryliuk.springemployeeserver.DAO.EmployeeRepository;
import com.havryliuk.springemployeeserver.DAO.Old.EmployeeDAO_old;
import com.havryliuk.springemployeeserver.Entityes.Employee;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService

{
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> result = employeeRepository.findById(id);
        Employee employee = null;
        if (result.isPresent())
        {
            employee = result.get();
        }
        else
        {
            throw new RuntimeException("There is no Employee with such id");
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

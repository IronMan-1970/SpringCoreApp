package com.havryliuk.springemployeeserver.DAO;

import com.havryliuk.springemployeeserver.Entityes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

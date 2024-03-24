package com.havryliuk.springemployeeserver.DAO.Old;

import com.havryliuk.springemployeeserver.Entityes.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl_old implements EmployeeDAO_old {

    EntityManager entity;
    @Autowired
    EmployeeDAOImpl_old(EntityManager entity){
        this.entity = entity;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery= entity.createQuery("from Employee ", Employee.class);
        List<Employee> theResult = theQuery.getResultList();
        return theResult;
    }


    @Override
    public Employee findById(int id) {
        return entity.find(Employee.class, id);
    }

    @Override
    public void deleteEmployee(int id) {
        entity.remove(entity.find(Employee.class, id));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return entity.merge(employee);
    }
}

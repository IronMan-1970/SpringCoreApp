package com.hibernate.hibernatelesson.DAOs;

import com.hibernate.hibernatelesson.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);

    List<Student> findAll();


}

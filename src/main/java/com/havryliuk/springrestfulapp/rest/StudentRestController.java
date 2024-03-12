package com.havryliuk.springrestfulapp.rest;

import com.havryliuk.springrestfulapp.models.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {
    List<Student> students = new ArrayList<>();
    @PostConstruct
    void init(){
        students.add(new Student(1, "Max", "Havryliuk", "sobaka@gmail.com"));
        students.add(new Student(2, "Vasil", "Extesildul", "sobaka@gmail.com"));

    }
    @GetMapping("/students")
    List<Student> returnAllStudents()
    {
        return students;
    }
    @GetMapping("/{id}")
    Student returnStudentById(@PathVariable int id)
    {
        return students.get(id);
    }
}

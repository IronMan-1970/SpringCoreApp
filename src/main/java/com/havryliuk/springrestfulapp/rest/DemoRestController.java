package com.havryliuk.springrestfulapp.rest;

import com.havryliuk.springrestfulapp.models.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/Demo")
public class DemoRestController {
    //додаю гет запит за адресою api/v1/Demo/Hello
    @RequestMapping("Hello")
    String HelloDemo(){
        return "Hello world";
    }
    List<Student> studentsSet = new ArrayList<>();
    @PostConstruct
    void init(){
        studentsSet.add(new Student(1, "Maxim", "sobaka@gmail.com", "Havryliuk"));
        studentsSet.add(new Student(2, "Vasil", "sobaka@gmail.com", "Extesidul"));

    }
    @GetMapping
    List<Student> returnAllStudents()
    {
        return studentsSet;
    }
}

package com.havryliuk.springrestfulapp.rest;

import com.havryliuk.springrestfulapp.models.ErrorResponse;
import com.havryliuk.springrestfulapp.models.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        // перевіряємо айді студента на існування
        if((id>=students.size())|| (id <= 0)){
            throw new ExceptionStudentNotFound("Student not found - " + id);
        }
        return students.get(id);
    }

    // Додаю Отримання винятків використовуючи @ExeptionHandler

    @ExceptionHandler
    public ResponseEntity<ExceptionStudentNotFound> handleException(ExceptionStudentNotFound exc){
        ErrorResponse errorResponse = new ErrorResponse();

        errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
        errorResponse.setDescription(exc.getMessage());
        errorResponse.setTimeStump(System.currentTimeMillis());
        return new ResponseEntity(errorResponse, HttpStatus.NOT_FOUND);
    }
    
    // Тут ми зробили отримання любих винятків
    @ExceptionHandler
    public ResponseEntity<ExceptionStudentNotFound> handleException(Exception exc){
        ErrorResponse errorResponse = new ErrorResponse();
        
        errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setDescription(exc.getMessage());
        errorResponse.setTimeStump(System.currentTimeMillis());
        return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
    }
}

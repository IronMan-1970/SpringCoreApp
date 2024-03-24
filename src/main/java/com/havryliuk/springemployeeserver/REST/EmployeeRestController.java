package com.havryliuk.springemployeeserver.REST;

import com.havryliuk.springemployeeserver.Entityes.Employee;
import com.havryliuk.springemployeeserver.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
    @Autowired
    EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> returnEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.saveEmployee(employee);

    }
    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable int id){

        employeeService.deleteEmployee(id);
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
}

package com.example.Employeemanagement.mainpackage.controller;

import com.example.Employeemanagement.mainpackage.entity.Department;
import com.example.Employeemanagement.mainpackage.entity.Employee;
import com.example.Employeemanagement.mainpackage.service.DepartmentService;
import com.example.Employeemanagement.mainpackage.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    private DepartmentService departmentService;

    @PostMapping("/employees/register/{id}")
    public Employee saveEmployee(@Valid @RequestBody Employee employee,@PathVariable Integer id){
        return employeeService.saveEmployee(employee,id);
    }
    @GetMapping("/employees/all")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeeByID(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @PutMapping("/employees/{id}")
    public Optional<Employee> updateEmployeeByID(@PathVariable Integer id,@RequestBody Employee employee){
        return employeeService.editEmployeeDetails(id,employee);
    }
    @DeleteMapping("/employees/{id}")
    public Optional<Employee> deleteEmployeeByID(@PathVariable Integer id){
        return  employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/employees/departments/{departmentId}")
    public List<Employee> getAllEmployeesOfDepartment(@PathVariable Integer departmentId){

        return null;
    }

}

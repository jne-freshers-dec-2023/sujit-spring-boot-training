package com.example.Employeemanagement.mainpackage.controller;

import com.example.Employeemanagement.mainpackage.entity.Department;
import com.example.Employeemanagement.mainpackage.entity.Employee;
import com.example.Employeemanagement.mainpackage.service.DepartmentService;
import com.example.Employeemanagement.mainpackage.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;



    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
       return  departmentService.getAllDepartment();
    }
    @GetMapping("/departments/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Integer id){
        return departmentService.getDepartmentById(id);
    }

    @PutMapping("/departments/{id}")
    public Department editDepartmentById(@PathVariable Integer id, @RequestBody Department body){
        return departmentService.editDepartmentById(id,body);
    }
    @DeleteMapping("/departments/{id}")
    public Optional<Department> deleteDepartmentById(@PathVariable Integer id){
        return departmentService.deleteDepartmentById(id);
    }

}

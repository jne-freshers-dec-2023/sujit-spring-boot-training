package com.example.Employeemanagement.mainpackage.service;

import com.example.Employeemanagement.mainpackage.entity.Department;
import com.example.Employeemanagement.mainpackage.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment( Department department){
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Integer id){
        return departmentRepository.findById(id);
    }

    public Department editDepartmentById(Integer id, Department body){
        body.setDepartmentId((int)id);
        return departmentRepository.save(body);
    }

    public Optional<Department> deleteDepartmentById(Integer id){
       Optional<Department> valueToReturn = departmentRepository.findById(id);
        departmentRepository.deleteById(id);
        return valueToReturn;
    }

}

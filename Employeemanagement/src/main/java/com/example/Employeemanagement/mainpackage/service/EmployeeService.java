package com.example.Employeemanagement.mainpackage.service;

import com.example.Employeemanagement.mainpackage.entity.Department;
import com.example.Employeemanagement.mainpackage.entity.Employee;
import com.example.Employeemanagement.mainpackage.repo.DepartmentRepository;
import com.example.Employeemanagement.mainpackage.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public Employee saveEmployee(Employee employee, Integer id){
        Optional<Department> departmentToBeAssigned = departmentRepository.findById(id);
        employee.setDepartment(departmentToBeAssigned.get());
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmployeeById(Integer id){
        return employeeRepository.findById(id);
    }

    public Optional<Employee> editEmployeeDetails(Integer id , Employee body){
        body.setId((int)id);
        employeeRepository.save(body);
        return  employeeRepository.findById(id);
    }

    public Optional<Employee> deleteEmployeeById(Integer id){
        Optional<Employee> EmployeeToBeDeleted = employeeRepository.findById(id);
        employeeRepository.deleteById(id);
        return EmployeeToBeDeleted;
    }
}

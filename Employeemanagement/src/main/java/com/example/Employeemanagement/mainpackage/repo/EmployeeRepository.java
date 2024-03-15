package com.example.Employeemanagement.mainpackage.repo;

import com.example.Employeemanagement.mainpackage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   List<Employee> findByDepartmentId(Integer id);
}

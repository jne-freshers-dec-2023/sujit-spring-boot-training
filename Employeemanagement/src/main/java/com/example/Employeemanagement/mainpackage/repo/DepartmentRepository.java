package com.example.Employeemanagement.mainpackage.repo;

import com.example.Employeemanagement.mainpackage.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}

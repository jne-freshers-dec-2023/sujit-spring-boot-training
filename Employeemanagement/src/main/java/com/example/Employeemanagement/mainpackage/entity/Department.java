package com.example.Employeemanagement.mainpackage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    @Column(unique = true)
    private String departmentName;

    @OneToMany(mappedBy = "department")
    @JsonIgnore
    private List<Employee> employees;

    public Department(int departmentId, String departmentName, List<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

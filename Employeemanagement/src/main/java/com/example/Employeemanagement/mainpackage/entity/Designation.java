package com.example.Employeemanagement.mainpackage.entity;

import jakarta.persistence.*;

import java.util.EnumMap;
import java.util.List;

@Entity
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int designationId;
    private String designationName;

    @OneToMany(mappedBy = "designation")
    private List<Employee> employees;

    public Designation(int designationId, String designationName, List<Employee> employees) {
        this.designationId = designationId;
        this.designationName = designationName;
        this.employees = employees;
    }

    public Designation() {
    }

    @Override
    public String toString() {
        return "Designation{" +
                "designationId=" + designationId +
                ", designationName='" + designationName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

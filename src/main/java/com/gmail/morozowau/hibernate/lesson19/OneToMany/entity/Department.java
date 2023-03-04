package com.gmail.morozowau.hibernate.lesson19.OneToMany.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "name")
    private String name;
    @Column(name = "min_salary")
    private int minSalary;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "dep")
    private List<Employee> employeeList;

    public Department() {
    }

    public Department(int maxSalary, String name, int minSalary) {
        this.maxSalary = maxSalary;
        this.name = name;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee employee){
        if (this.employeeList == null) this.employeeList = new ArrayList<>();
        this.employeeList.add(employee);
        employee.setDep(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", maxSalary=" + maxSalary +
                ", name='" + name + '\'' +
                ", minSalary=" + minSalary +
                ", employeeList=" + employeeList +
                '}';
    }
}

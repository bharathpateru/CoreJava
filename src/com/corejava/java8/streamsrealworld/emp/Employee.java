package com.corejava.java8.streamsrealworld.emp;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private boolean active;
    private String email;

    public Employee(int id, String name, String department, double salary, boolean active, String email) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.active = active;
        this.email = email;
    }

    public Employee() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", active=" + active +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary, active, email);
    }
}

package com.corejava.java8.streamsrealworld.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Anil", "Engineering", 85000, true, "anil@company.com"));
        employeeList.add(new Employee(2, "Sunita", "HR", 60000, true, "sunita@company.com"));
        employeeList.add(new Employee(3, "Ravi", "Engineering", 75000, false, "ravi@company.com"));
        employeeList.add(new Employee(4, "Meena", "Engineering", 95000, true, "meena@company.com"));
        employeeList.add(new Employee(5, "John", "Finance", 90000, true, "john@company.com"));
        return employeeList;
    }

}

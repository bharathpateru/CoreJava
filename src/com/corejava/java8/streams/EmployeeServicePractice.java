package com.corejava.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServicePractice {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();
        /*
        Find Highest paid employee in each department
         */
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).entrySet().forEach((entry)-> System.out.println(entry.getKey() + "----" + entry.getValue()));

        System.out.println("------------");

        /*
        Second highest Salary of Employee
         */

        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        /*
        Group employees by department
         */
        System.out.println("------------");
        Map<String, List<Employee>> departmentWiseEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        System.out.println(departmentWiseEmployees);

        System.out.println("------------");
        /*
        Avg department salary
         */
        Map<String, Double> avgDeptSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgDeptSal);

        /*
        Second Highest salary without sorted() method
         */


        System.out.println("------------------------------------------------");

    }
}

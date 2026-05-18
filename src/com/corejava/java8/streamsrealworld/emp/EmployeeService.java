package com.corejava.java8.streamsrealworld.emp;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void main(String[] args) {
        List<Employee> employeeList = new EmployeeDao().getEmployees();

        /*Filter Active Employees*/
        /* Filter employees from the Engineering department */
        /* Filter employees with salary > 80,000 */
        /*  Collect only their email IDs into a List<String>  */

        List<String> engineeringEmails =
                employeeList.stream()
                        .filter(Employee::isActive)
                        .filter(emp -> "Engineering".equalsIgnoreCase(emp.getDepartment()))
                        .filter(emp -> emp.getSalary() > 80_000)
                        .map(Employee::getEmail)
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());

        engineeringEmails.forEach(System.out::println);
    }
}

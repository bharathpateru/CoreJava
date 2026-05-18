package com.corejava.java8.streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDao.getEmployeeList();
        // System.out.println(employeeList);

        /* How many male and female employees are there in the organization? */
        Map<String, Long> collect = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println(collect);

        /* Print the name of all departments in the organization? */
        employeeList.stream().map(Employee::getDepartment).forEach((System.out::println));
        /* What is the average age of male and female employees?  */
        //employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))).entrySet().forEach((entry)-> System.out.println(entry.getKey() + " " +entry.getValue()));
        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        for (Map.Entry<String, Double> entry: avgAge.entrySet()){
            System.out.println(entry.getKey() +" :: "+entry.getValue().intValue());
        }

        /*
        Highest Paid employee in each department
         */

       // employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.toList())).entrySet().stream().ma
        System.out.println("********************************************Highest Paid employee in each department******************************");
        
        Map<String, Optional<Employee>> result =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                        ));

       for (Map.Entry<String, Optional<Employee>> empMap: result.entrySet()){
           System.out.println(empMap.getKey());
           System.out.println(empMap.getValue().get());
       }

       /*
         2️⃣ Second highest salary employee overall
        */
        System.out.println("********************************************Second highest salary employee overall******************************");
        Optional<Employee> employee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()))
                .keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .map((sal) -> employeeList.stream().filter(e -> e.getSalary() == sal).findFirst().get());

        employee.ifPresent((emp)->System.out.println(emp));

        /*
        *
        * Count employees by gender sorted by count desc?
        * */
        System.out.println("********************************************Count employees by gender sorted by count desc?******************************");
        Map<String, Long> genderCountMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        for (Map.Entry<String, Long> entry: genderCountMap.entrySet()){
            System.out.println(entry.getKey() + "----"+entry.getValue());
        }

        /*
        * List employee names who joined before 2019, grouped by department
         * */
        System.out.println("***********************List employee names who joined before 2019, grouped by department**************************************");
        Map<String, List<String>> res =
                employeeList.stream()
                        .filter(e -> e.getJoiningDate().isBefore(LocalDate.of(2019, 1, 1)))
                        .collect(Collectors.groupingBy(
                                e -> e.getDepartment() == null ? "UNKNOWN" : e.getDepartment(),
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        ));

        System.out.println(res);

        /*
        * Average salary per department, ignore employees aged < 25
        */
        System.out.println("****************Average salary per department, ignore employees aged < 25**********************");

        Map<String, Double> avgSalary = employeeList.stream()
                .filter((ep) -> ep.getAge() >= 25)
                .collect(Collectors.groupingBy(d->d.getDepartment()==null ? "UNKNOWN" : d.getDepartment(), Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);

        /*
        * Find the youngest employee in each department?
        * */
        System.out.println("----------------------Find the youngest employee in each department?----------------------");
        Map<String, Employee> youngestEmployee = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment() == null ? "UNKNOWN" : e.getDepartment(),
                //Collectors.minBy(Comparator.comparing(Employee::getAge))
                Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getAge)), Optional::get)
        ));
        youngestEmployee.forEach((key, value)->System.out.println(key +" ------"+value));

        /*
        * Employee(s) with salary greater than department average?
        * */
        System.out.println("********Employee(s) with salary greater than department average?**************");
        Map<String, Double> avgSalMap = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment() == null ? "UNKNOWN" : e.getDepartment(),
                Collectors.averagingDouble(Employee::getSalary)
        ));

        Map<String, List<Employee>> employeesMap = employeeList
                .stream()
                .filter(e -> e.getSalary() > avgSalMap.get(e.getDepartment() == null ? "UNKNOWN" : e.getDepartment()))
                .collect(Collectors.groupingBy(e -> e.getDepartment() == null ? "UNKNOWN" : e.getDepartment()));
        employeesMap.forEach((dept, employees)->{
            System.out.println(dept);
            employees.forEach(e->{
                System.out.println(e.getName() + "---"+e.getSalary()+ "---"+e.getDepartment());
            });
        });

        /*
        Second Highest Salary from employees overAll
         */
        System.out.println("-------------Second Highest Salary---------------");
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        /*
        second highest salary in the HR department
         */

        System.out.println("-------------Second Highest Salary in HR Department---------------");
        employeeList.stream().filter((employe)->employe.getDepartment().equalsIgnoreCase("HR")).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);
        System.out.println("-------------Employees list whose salary greater than 2500---------------");
        List<Employee> employeesSalaryGreater = employeeList.stream().filter((employee1 -> employee1.getSalary() > 25000)).collect(Collectors.toList());
        System.out.println(employeesSalaryGreater.size());

    }
}

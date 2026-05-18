package com.corejava.java8.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0, "java", LocalDate.of(2018, 6, 10)));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0, ".Net", LocalDate.of(2019, 3, 15)));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0, "python", LocalDate.of(2021, 1, 20)));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0, "python", LocalDate.of(2017, 8, 1)));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0, "python", LocalDate.of(2017, 8, 1)));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0, "java", LocalDate.of(2022, 5, 12)));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0, "java", LocalDate.of(2022, 5, 12)));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0, "Angular", LocalDate.of(2015, 2, 28)));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0,"Angular", LocalDate.of(2016, 11, 5)));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5, "React", LocalDate.of(2016, 11, 5)));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0, "React", LocalDate.of(2021, 9, 18)));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0, "React", LocalDate.of(2020, 4, 30)));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0, "React", LocalDate.of(2020, 4, 30)));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5, "python", LocalDate.of(2014, 12, 1)));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0, "java", LocalDate.of(2014, 12, 1)));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0, "React", LocalDate.of(2023, 6, 1)));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0, "Angular", LocalDate.of(2010, 1, 5)));
    return employeeList;
    }
}

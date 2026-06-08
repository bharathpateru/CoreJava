import java.util.*;
import java.util.stream.Collectors;


class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
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
}

public class Test {
    public static void main(String[] args) {

        Employee e = new Employee("bharath", "IT", 3000);
        Employee e1 = new Employee("Anand", "CSE", 2000);
        Employee e2 = new Employee("Laxman", "IT", 3000);
        Employee e3 = new Employee("Gaurav", "IT", 4000);

        List<Employee> employees = new ArrayList<>();
        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);



    }
}
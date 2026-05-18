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



        Map<String, List<Employee>> top3ByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                .limit(3)
                                                .collect(Collectors.toList())
                                )
                        ));


        for (Map.Entry<String, List<Employee>> employee : top3ByDept.entrySet()){
            System.out.print(employee.getKey());
            for (int i = 0; i < employee.getValue().size(); i++) {
                System.out.println(" "+employee.getValue().get(i).getName());
            }
        }
    }
}
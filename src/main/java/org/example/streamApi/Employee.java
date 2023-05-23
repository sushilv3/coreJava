package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 75000));
        employees.add(new Employee("Charlie", 60000));
        employees.add(new Employee("Bob", 90000));
        employees.add(new Employee("Alice", 80000));
        employees.add(new Employee("Dave", 40000));
        return employees;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee(name=" + name + ", salary=" + salary + ")";
    }
}
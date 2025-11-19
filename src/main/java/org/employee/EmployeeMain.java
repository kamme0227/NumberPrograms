package org.employee;

import org.example.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "HR", 40000),
                new Employee(102, "Alice", "IT", 55000),
                new Employee(103, "Bob", "Finance", 45000),
                new Employee(104, "David", "IT", 65000),
                new Employee(105, "Eve", "HR", 35000)
        );

//        Map<String , Optional<Employee>> maxSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//
//        maxSalary.forEach((k,v)->System.out.println(k +" "+v));

//        List<Employee> list=employees.stream().filter(e->e.getSalary()>30000).collect(Collectors.toList());
//
//        list.forEach(employee -> System.out.println(employee));

        List<Employee> getEmployeeBasedOnLocation=employees.stream().filter(n->n.getDepartment().equalsIgnoreCase("IT")).collect(Collectors.toList());
    }
}

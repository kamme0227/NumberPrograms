package com.codesnippet;

import com.employee.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        List<Employee> list= Arrays.asList(new Employee("suresh","IT",19,"Bengalore",45000),
                new Employee("ramesh","ECE",20,"Hyderabad",60000),
                new Employee("yash","EEE",21,"Chennai",70000),
                new Employee("narendra","EIE",22,"Pune",80000),
                new Employee("shesh","MECH",23,"Mumbai",90000),
                new Employee("shesh","MECH",23,"Mumbai",90000));

        List<Employee> sortEmployeeBySalary=list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());

        sortEmployeeBySalary.forEach(System.out::println);


        //Group the employee by department and calculate average salary

      Map<String,Double> averageSalary = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

      averageSalary.forEach((k,v)->System.out.println(k+" "+v));

      //find highest paid employee in each department

        Map<String, Optional<Employee>> highestPaidEmp=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        highestPaidEmp.forEach((k,v)->System.out.println(k+" "+v));

        //find department more than 2 employee

        Map<String,Long> departmentByEmp=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        Map<String,Long> result=departmentByEmp.entrySet().stream()
                .filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        result.forEach((k,v)->System.out.println(k+" "+v));

        //find the most common first letter among all the employee

        Optional<Map.Entry<Character, Long>> map=list.stream().map(e->e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(map);
    }
}

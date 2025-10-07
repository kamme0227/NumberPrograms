package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class EmployeeMain {
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", "HR", 40000),
                new Employee(102, "Alice", "IT", 55000),
                new Employee(103, "Bob", "Finance", 45000),
                new Employee(104, "David", "IT", 65000),
                new Employee(105, "Eve", "HR", 35000)
        );


        // filter out the employees particular department


//        List<Employee> departmentWise=employees.stream().filter(emp->emp.getDepartment().equals("IT")).collect(Collectors.toList());
//
//        System.out.println(departmentWise);

        //Highest Paid Employee

//        Optional<Employee> highestPaidEmp=employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
//
//        highestPaidEmp.ifPresent(System.out::println);

        //sort the employee ascending order

//

        //Group the employees by department

//        Map<String,List<Employee>> department=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//
//        department.forEach((e,d)->System.out.println(e +" "+ d));

        //Average salary of each department

//        Map<String,Double> departmentWiseAverage=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//
//        System.out.println(departmentWiseAverage);

   //Second highest salary

//        Optional<Employee> secondHighestSalary= Optional.ofNullable(employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null));
//
//        secondHighestSalary.ifPresent(System.out::println);

        //Convery list employeed to map<id ,name>

//        Map<Integer,String> empMap=employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
//
//        System.out.println(empMap);

        //Find Employees Whose Name Starts with "A"

//        List<Employee> nameStartWithA=employees.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());
//
//        nameStartWithA.forEach(System.out::println);

        //Find the total salary

        double totalSalary=employees.stream().mapToDouble(e->e.getSalary()).sum();

        System.out.println(totalSalary);
    }

}


package com.employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Employee> list= Arrays.asList(new Employee("suresh","IT",19,"Bengalore",45000),
                new Employee("ramesh","ECE",20,"Hyderabad",60000),
                new Employee("yash","EEE",21,"Chennai",70000),
                new Employee("narendra","EIE",22,"Pune",80000),
                new Employee("shesh","MECH",23,"Mumbai",90000),
                new Employee("shesh","MECH",23,"Mumbai",90000));


        //Based on location
//        List<Employee> bengaloreLocation=list.stream().filter(n->n.getLocation().equalsIgnoreCase("hyderabad")).collect(Collectors.toList());
//
//        bengaloreLocation.forEach(e->System.out.println(e.getName()+" "+e.getLocation()));

        //removed duplicate employee object

//        Set<Employee> unique=new HashSet<>();
//
//        Set<Employee> duplicates=list.stream().filter(emp->!unique.add(emp)).collect(Collectors.toSet());
//
//       duplicates.forEach(System.out::println);

        // maximum value
//       Optional<Employee> maxSalary=list.stream().max(Comparator.comparingDouble(Employee::getSalary));
//
//       System.out.println(maxSalary);

       //Maximum values of top two

//        List<Employee> top2Salary=list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct().limit(2)
//                .collect(Collectors.toList());
//
//        top2Salary.forEach(System.out::println);

        //Count how many employee's in each department

//        Map<String,Long> countEmployeeEachDepartment=list.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//
//        countEmployeeEachDepartment.forEach((k,v)->System.out.println(k+" "+v));

        //highest salary per department

//        Map<String,Optional<Employee>> highestSalaryPerDepartment=list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//
//        highestSalaryPerDepartment.forEach((k,v)->System.out.println(k+" "+v));


        // take first character and maximum repeated character of first letter

        Optional<Map.Entry<Character, Long>> charMap=list.stream().map(e->e.getName().charAt(0))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(charMap);

    }
}

package com.clientinterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpComparator {

    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(new Employee(101,"suresh"),
                new Employee(102,"naresh"),
                new Employee(103,"ramesh"),new Employee(104,"Anusha"));

        List<Employee> sortedEmp=empList.stream().sorted(Comparator.comparing(Employee::getId).thenComparing(Employee::getName)).collect(Collectors.toList());
    sortedEmp.forEach(System.out::println);
    }
    }

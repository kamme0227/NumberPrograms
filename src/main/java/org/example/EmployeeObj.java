package org.example;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeObj {

    String name;
    int age;
    long id;
    String gender;
    String department;
    Double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public EmployeeObj(String name, int age, long id, String gender, String department, Double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{id=%d, age=%d, name=%s, gender=%s, department=%s, salary=%.2f}",
                id, age, name, gender, department, salary);
    }

    public static class Main {
        public static void main(String[] args) {
            List<EmployeeObj> list= Arrays.asList(new EmployeeObj("suresh",27,26,"male","EIE",42000.0),
                    new EmployeeObj("ramesh",17,28,"male","EEE",32000.0),
                    new EmployeeObj("anusha",27,26,"male","CSE",22000.0),
                    new EmployeeObj("balaji",27,26,"male","EIE",12000.0));

            //GenderCount and AverageSalary

//            Map<String,Long> genderCount=list.stream().collect(Collectors.groupingBy(EmployeeObj::getGender,Collectors.counting()));
//            Double averageSalary=list.stream().collect(Collectors.averagingDouble(EmployeeObj::getSalary));
//
//            System.out.println(genderCount);
//            System.out.println(averageSalary);

            //HighestSalary Employee

            Optional<EmployeeObj> highestSalaryEmp=list.stream().max(Comparator.comparingDouble(EmployeeObj::getSalary));

            highestSalaryEmp.ifPresent(EmployeeObj->System.out.println(highestSalaryEmp));

        }
    }
}


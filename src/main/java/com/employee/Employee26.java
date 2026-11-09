package com.employee;

public class Employee26 {

    int id;
    String firstName;
    String lastName;
    double salary;
    String department;

    Employee26(int id, String firstName, String lastName, double salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

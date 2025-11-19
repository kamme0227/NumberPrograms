package com.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {

    String name;
    String department;
    int id;
    String location;
    double salary;
}


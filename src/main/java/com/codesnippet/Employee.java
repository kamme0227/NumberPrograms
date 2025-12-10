package com.codesnippet;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee
{
 String name;
 int id;
 String department;
 String location;
 double salary;
 int age;
}


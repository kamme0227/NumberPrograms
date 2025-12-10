package com.optional;

import java.util.Optional;

public class Employee {

    String name;

    Employee(String name)
    {
        this.name=name;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public static void main(String[] args)
    {
        Employee emp=new Employee(" ");

        String name=emp.getName().map(String::strip).filter(n->!n.isEmpty()).orElse("Default value");

        System.out.println(name);

    }

}

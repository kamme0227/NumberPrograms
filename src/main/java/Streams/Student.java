package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    public String toString() {
        return age + " - " + name;
    }
}



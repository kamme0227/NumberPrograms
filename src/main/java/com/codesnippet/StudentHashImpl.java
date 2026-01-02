package com.codesnippet;

import java.util.Objects;

public class StudentHashImpl {

    int id;
    String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    StudentHashImpl(int id, String name)
    {
        this.id=id;
        this.name=name;

    }

    public int hashcode()
    {
        return Objects.hash(id,name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) {
            return false;
        }
        StudentHashImpl studentHash = (StudentHashImpl) obj;
        return id == studentHash.id && Objects.equals(name, studentHash.name);
    }
        public static void main(String[] args)
        {
            StudentHashImpl studentHash1=new StudentHashImpl(1,"suresh");
            StudentHashImpl studentHash2=new StudentHashImpl(2,"anusha");
            StudentHashImpl studentHash3=new StudentHashImpl(3,"loukya");

            System.out.println("studentHash1.equals(studentHash2):"+studentHash1.equals(studentHash2));

            System.out.println(studentHash1.hashcode());
        }


}

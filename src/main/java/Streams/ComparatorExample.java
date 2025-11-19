package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample
{
    public static void main(String[] args)
    {
        List<Student> list= Arrays.asList(new Student(23,"mike"),new Student(25,"naresh")
                ,new Student(27,"loukya"));

        Comparator<Student> sortByName=(s1, s2)->s1.name.compareTo(s2.name);
        Comparator<Student> sortByage=(s1,s2)->s1.age-s2.age;


        Collections.sort(list,sortByName);
        Collections.sort(list,sortByage);
        
        System.out.println(list);
        System.out.println(list);
    }
}

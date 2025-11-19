package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample
{
    public static void main(String[] args)
    {
        List<Student> sortByAge= Arrays.asList(new Student(27,"suresh")
                ,new Student(23,"ramesh"));
        Collections.sort(sortByAge);
        
        System.out.println(sortByAge);
    }
}

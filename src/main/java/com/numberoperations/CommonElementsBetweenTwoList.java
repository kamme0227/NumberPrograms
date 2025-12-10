package com.numberoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoList {

    public static void main(String[] args)
    {
        List<String> list1= Arrays.asList("Java","SpringMVC","Hibernate","JPA","Microservices","gitlab","kafka","sql".toLowerCase());
        List<String> list2=Arrays.asList("java","javascript","HTML","CSS","ReactJs","Angular","kafka".toLowerCase());



        List<String> list3=list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println(list3);
    }
}

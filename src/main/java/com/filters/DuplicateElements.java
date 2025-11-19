package com.filters;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args)
    {
        List<String> strList= Arrays.asList("A","A","B","C","D","B","D");

//        Set<String> uniqueNames=new HashSet<>();
//        Set<String> duplicates=strList.stream().filter(name->!uniqueNames.add(name)).collect(Collectors.toSet());
//
//       System.out.println(uniqueNames+" " + duplicates);

        Set<String> countDuplicates=strList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).collect(Collectors.toSet());

        countDuplicates.forEach(System.out::println);
    }
}

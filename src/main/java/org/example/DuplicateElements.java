package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args)
    {
        List<Integer> numbers= Arrays.asList(2,2,3,4,5,6,5,6,7,7,9,8,9,7);

        List<Integer> duplicateElements=numbers.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()>0).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicateElements);

    }
}

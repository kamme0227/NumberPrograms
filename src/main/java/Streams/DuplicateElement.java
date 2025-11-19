package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,4,3,5,6,9);

//        Set<Integer> hasSet=new HashSet<>();
//
//        Set<Integer> duplicateElements=list.stream().filter(n->!hasSet.add(n)).collect(Collectors.toSet());
//
//        duplicateElements.forEach(System.out::println);

        List<Integer> secondMethod=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        secondMethod.forEach(System.out::println);
    }
}

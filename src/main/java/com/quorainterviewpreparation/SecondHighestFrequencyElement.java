package com.quorainterviewpreparation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestFrequencyElement {

    public static void main(String[] args) {

        // print the second highestfrequency number

        List<Integer> nums = Arrays.asList(10,20,10,20,20,30);

        Map<Integer,Long> freqMap=nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        freqMap.values().stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
                .ifPresentOrElse(freq-> freqMap.entrySet().stream().filter(e->e.getValue().equals(freq))
                        .forEach(e->System.out.println("second maximum element"+e.getValue()+" "+e.getKey())),()->System.out.println("no second largest element is preset"));

//   for string

        List<String> frequencyStringMap=Arrays.asList("apple", "banana", "apple",
                                             "banana", "banana","orange");

        Map<String,Long> frequencyMap=frequencyStringMap.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        freqMap.values().stream().distinct().skip(1).findFirst()
                .ifPresentOrElse(frq->frequencyMap.entrySet().stream()
                        .filter(e->e.getValue().equals(frq))
                        .forEach(e->System.out.println("second maximum element"+e.getValue()+" "+e.getKey())),()->System.out.println("no second largest element is preset"));

    }
}

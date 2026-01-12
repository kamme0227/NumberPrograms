package com.codesnippet;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondMostRepeatedCharacter {

    public static void main(String[] args)
    {
        String str="aaaabbccbdd";

        Character secondRepeatedCharacter= str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().map(Map.Entry::getKey).orElse(null);

        System.out.println(secondRepeatedCharacter);
    }
}

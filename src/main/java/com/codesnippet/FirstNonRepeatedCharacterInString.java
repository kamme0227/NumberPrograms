package com.codesnippet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {

    public static void main(String[] args)
    {
        String s="suresh";

        Character firstNonRepeatedChar=s.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).findFirst().get().getKey();

        System.out.println(firstNonRepeatedChar);
    }
}

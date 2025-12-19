package com.codesnippet;

import com.employee.Main;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDemo {

    public static void main(String[] args)
    {
        String str="banana";

        Map<Character,Long> characterCount=str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(characterCount);


        //maximum repeated character

        Map.Entry<Character,Long> maxRepeatedElement=characterCount.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

        System.out.println(maxRepeatedElement);


        //duplicate characters

        List<Character> duplicateChars=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(duplicateChars);

        //fist non repeated character

        Character ch=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).findFirst().get().getKey();

        System.out.println(ch);


    }
}

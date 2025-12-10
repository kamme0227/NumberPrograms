package com.codesnippet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExamples {

    public static void main(String[] args)
    {
        List<String> listOfStrings= Arrays.asList("fruit","mango","banana","orange","grapes");

        //How Many strings are starting with "A"

        long startsWithA=listOfStrings.stream().filter(str->str.toUpperCase().startsWith("A")).count();

        System.out.println(startsWithA);

        //Join the list of strings into single list seperated by ","

        String singleString=listOfStrings.stream().collect(Collectors.joining(","));

        System.out.println(singleString);

        //find the first non empty string

        Optional str=listOfStrings.stream().filter(n->!n.isEmpty()).findFirst();

        System.out.println(str);

        // List of words and map to their length

        Map<Integer,List<String>> lengthMap=listOfStrings.stream().collect(Collectors.groupingBy(String::length));

        lengthMap.forEach((k,v)->System.out.println(k+" "+v));


    }
}

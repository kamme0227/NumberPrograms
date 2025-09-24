package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Strings {

    public static void main(String[] args)
    {

        //List of strings into single string

//        List<String> listOfStrings= Arrays.asList("Banana","Apple","Kiwi","Cherry");
//
//        String result=listOfStrings.stream().collect(Collectors.joining(","));
//
//        System.out.println(result);

        //first non repeated character

      //  String input="simple code";

//        Optional<Character> result= input.chars().mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting())).entrySet().stream()
//                .filter(e->e.getValue()>1).map(Map.Entry::getKey).findFirst();
//
//        System.out.println(result);

        //count the frequency of characters

//        Map<Character,Long> frequencyMap=input.chars().mapToObj(c->(char)c).filter(c->c!=' ')
//                .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
//
//        frequencyMap.forEach((c,k)->System.out.println("Character "+ c +" count "+ k));

        //List of String map their length

        List<String> listOfStrings=Arrays.asList("Banana","Kiwi","Apple","Date");

        Map<Integer,List<String>> mapByLength=listOfStrings.stream().collect(Collectors.groupingBy(String::length));

        mapByLength.forEach((s,c)->System.out.println("list of strings "+s+" by their length "+c));


    }
}

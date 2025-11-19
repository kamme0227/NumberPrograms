package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "suresh";

        // first non repeated character
//        Character result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(s -> s.getValue() == 1).findFirst().orElse(null);
//        System.out.println(ch);

        //count each character

//        Map<Character,Long> frequencyMap=str.chars().mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        frequencyMap.forEach((k,v)->System.out.println(k+" "+v));

        List<String> list= Arrays.asList("banana","mango","apple","grapes");

        Map<Integer,List<String>> lengthOfString=list.stream().collect(Collectors.groupingBy(String::length));

        lengthOfString.forEach((k,v)->System.out.println(k+" "+v));
    }

}

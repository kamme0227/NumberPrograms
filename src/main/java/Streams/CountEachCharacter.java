package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacter {
    public static void main(String[] args)
    {
        String input="aabbbcccc";
//        Map<Character,Long> frquencyMap=input.chars().mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        frquencyMap.forEach((k,v)->System.out.println(k+" "+v));
    }
}

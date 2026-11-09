package com.designpatterns;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maxioccuerence {

    public static void main(String[] args)
    {
        //Find the max occuerence of word with max length
        //A BC BBA BC BBA D

        List<String> max= Arrays.asList("A","BC","BBA","BC","BBA","D");

        String result=max.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry<String,Long>::getValue).thenComparing(e->e.getKey().length())).get().getKey();

        System.out.println(result);


    }
}

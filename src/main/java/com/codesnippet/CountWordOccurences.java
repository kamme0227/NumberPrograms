package com.codesnippet;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordOccurences {

    public static void main(String[] args)
    {
        String str="Java is powerful language".toLowerCase();

      Map<String,Long> words = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

      System.out.println(words);
    }
}

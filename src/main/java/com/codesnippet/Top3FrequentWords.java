package com.codesnippet;

import com.employee.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

public class Top3FrequentWords {

    public static void main(String[] args)
    {
        String paragraph="java is great. Java is object oriented. Java streams are powerful, and java is fun!;";

       List<Map.Entry<String,Long>> result =Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z\\s]","").split(" "))
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
               .limit(3).toList();

      System.out.println(result);


    }
}

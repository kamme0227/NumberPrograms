package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Integers {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(12,15,16,17,19,20,30,40);

        List<Integer> numberStartsWith1=list.stream().filter(e->String.valueOf(e).startsWith("1"))
                .collect(Collectors.toList());

        numberStartsWith1.forEach(System.out::println);

    }
}

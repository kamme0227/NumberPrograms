package com.filters;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args)
    {
        List<String> list=List.of("Al","Bob","Ben","Alice");

        List<String> filterElementsByLength=list.stream().filter(s->s.length()>3).map(String::toUpperCase).collect(Collectors.toList());
        filterElementsByLength.forEach(System.out::println);
    }
}

package com.stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReversWords {
    public static void main(String[] args)
    {
        List<String> str= Arrays.asList("My name is suresh","Java is my career");

        List<String> reverseStr=str.stream().map(s->Arrays.stream(s.split(" ")).map(word->new StringBuilder(word).reverse()
                .toString()).collect(Collectors.joining(" "))).collect(Collectors.toList());

        System.out.println(reverseStr);
    }
}

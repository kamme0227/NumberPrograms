package com.started080426;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdString{
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","cherry","mango","orange","kiwi");

        words.stream().sorted(Comparator.comparingInt(String::length)).skip(2).findFirst().ifPresent(System.out::println);
    }
}

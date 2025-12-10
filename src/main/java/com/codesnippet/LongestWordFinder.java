package com.codesnippet;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordFinder {

    public static void main(String[] args)
    {
        String sentence="The quick, brown fox jumped over the lazy dog!";

        String result= Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z\\s]"," ").split(" "))
                .max(Comparator.comparing(String::length)).orElse(" ");

        System.out.println(result);
    }
}

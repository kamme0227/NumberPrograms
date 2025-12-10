package com.codesnippet;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args)
    {
        String sentence="java streams are powerful";

        String reverse= Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z\\s]"," ").split(" "))
                .map(w->new StringBuilder(w).reverse().toString()).collect(Collectors.joining(" "));

        System.out.println(reverse);

        // reverse the all sentence without using built in function

        String reverseStr= Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z\\s]"," ").split(" "))
                .map(word->Arrays.stream(word.split("")).reduce("",(rev,ch)->ch + rev)).collect(Collectors.joining(" "));

        System.out.println(reverseStr);
    }
}


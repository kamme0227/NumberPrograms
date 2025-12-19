package com.codesnippet;

import java.util.List;
import java.util.stream.Collectors;

public class CountVowels {

    public static void main(String[] args)
    {
        String s="suresh";

        String vowels=s.chars().mapToObj(c->(char)c).filter(e-> "aeiou".indexOf(e)!=-1).map(String::valueOf).collect(Collectors.joining());

        System.out.println(vowels);
    }
}

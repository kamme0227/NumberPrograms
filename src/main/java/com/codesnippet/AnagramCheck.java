package com.codesnippet;

import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args)
    {
        String str1="silent";
        String str2="listen";
        String sortedStr1=str1.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
        String sortedStr2=str2.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());

        boolean isAnagram=sortedStr2.equals(sortedStr1);
        System.out.println(isAnagram);
    }

}

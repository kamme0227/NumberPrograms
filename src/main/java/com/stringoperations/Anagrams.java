package com.stringoperations;

import org.example.Strings;

public class Anagrams {

    public static boolean anagramCheck(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length())
        {
            return false;
        }
        String sorted1=s1.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();
        String sorted2=s2.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();

        return sorted1.equals(sorted2);
    }
    public static void main(String[] args)
    {
        System.out.println(anagramCheck("suresh","hserus"));
        System.out.println(anagramCheck("listen","risten"));
    }
}

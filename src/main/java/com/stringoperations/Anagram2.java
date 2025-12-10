package com.stringoperations;

public class Anagram2 {

    public static boolean anagramCheck(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        String sorted1=s1.chars().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        String sorted2=s2.chars().collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();
        return sorted1.equals(sorted2);
    }
    public static void main(String[] args)
    {
        System.out.println(anagramCheck("suresh","suresh"));
    }
}

package com.codesnippet;

import java.util.Arrays;
import java.util.stream.Stream;

public class CheckVowelOrConsonant {

    public static void main(String[] args)
    {
        char ch='k';

        boolean isVowelOrConsonant= Stream.of('a','e','i','o','u','A','E','I','O','U').anyMatch(v->v==ch);

        if(isVowelOrConsonant)
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}

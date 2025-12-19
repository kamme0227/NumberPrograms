package com.stringoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeFirstLatterOfEachString {

    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("suresh","anusha","loukya","kamme");

       List<String> capitalizeFirstLetter=list.stream().map(word->word.substring(0,1).toUpperCase()+word.substring(1))
               .collect(Collectors.toList());

       capitalizeFirstLetter.forEach(System.out::println);


    }
}

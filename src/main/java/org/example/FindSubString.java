package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.compare;

public class FindSubString {

    public static void main(String[] args)
    {
        List<String> listOfStrings= Arrays.asList("Banana","Apple","Kiwi","Cherry","Mango");

        Optional<String> subString= listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).skip(2)
                .findFirst();

        subString.ifPresent(System.out::println);
    }
}

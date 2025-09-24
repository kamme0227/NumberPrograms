package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.compare;

public class FindSubString {

    public static void main(String[] args)
    {
        List<String> listOfStrings= Arrays.asList("Banana","Apple","Kiwi","Cherry","Mango");

        Optional<String> subString= listOfStrings.stream().sorted((w1, w2)->Integer.compare(w1.length(),w2.length())).skip(2)
                .skip(2).findFirst();

        subString.ifPresent(System.out::println);
    }
}

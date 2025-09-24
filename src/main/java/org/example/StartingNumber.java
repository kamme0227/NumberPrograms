package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingNumber {

    public static void main(String[] args)
    {
        List<Integer> numbers= Arrays.asList(1,2,4,5,6,7,112,44,2,13,14,15,17);

        List<Integer> filterNumbersStartingOne=numbers.stream().filter(n->String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(filterNumbersStartingOne);
    }
}

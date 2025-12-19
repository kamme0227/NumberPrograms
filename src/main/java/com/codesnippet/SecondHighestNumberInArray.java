package com.codesnippet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestNumberInArray {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> secondHighestNumber=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        System.out.println(secondHighestNumber);
    }
}

package com.codesnippet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSortedListIntoSingleList {

    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

        List<Integer> result = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).distinct().sorted().collect(Collectors.toList());
    }
}

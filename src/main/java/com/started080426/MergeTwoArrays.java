package com.started080426;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9};

        Integer[] result= Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}

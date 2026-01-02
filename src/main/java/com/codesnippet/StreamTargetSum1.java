package com.codesnippet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTargetSum1 {

    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50,60};

        int targetSum=40;

        List<String> list= IntStream.range(0,arr.length-1).boxed().flatMap(i->IntStream.range(i+1,arr.length)
                .filter(j->arr[i]+arr[j]==targetSum).mapToObj(j->arr[i]+" "+arr[j]+"="+targetSum)).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}

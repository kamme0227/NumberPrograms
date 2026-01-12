package com.codesnippet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeriesOfNumbers {

    public static void main(String[] args)
    {
        int start=11;

        List<Integer> list=IntStream.iterate(0, i->i+1).limit(5).map(i->start+i*i).boxed().toList();

        System.out.println(list);
    }
}

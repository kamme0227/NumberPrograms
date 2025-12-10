package com.codesnippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattedList {

    public static void main(String[] args)
    {
        List<List<Integer>> flattedList= Arrays.asList(Arrays.asList(1,2,3,4,5)
                ,Arrays.asList(6,7,8,9),Arrays.asList(9,8,7,6));

        List<Integer> singleList=flattedList.stream().flatMap(List::stream).toList();

        System.out.println(singleList);
    }
}

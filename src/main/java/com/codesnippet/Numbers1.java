package com.codesnippet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers1 {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,4,6,7,9,8,4,2,12,10,20);

        List<Integer> divisibleby23=list.stream().filter(n->n%2==0 && n%3==0).collect(Collectors.toList());

        System.out.println(divisibleby23);
    }
}

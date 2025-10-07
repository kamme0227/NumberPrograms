package com.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {

    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("256","143","456","123");
//
//        List<String> filtered=new ArrayList<>();
//        for(String name: list)
//        {
//           if(name.toLowerCase().startsWith("j "))
//            {
//                filtered.add(name);
//            }
//            }
//        System.out.println(filtered);

        List<String> filtered=list.stream().filter(name->String.valueOf(name).startsWith("1")).collect(Collectors.toList());
        System.out.println(filtered);
    }
}

package com.codesnippet;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompressString1 {
    public static void main(String[] args)
    {
        String input="aaaabbcccaa";

        List<String> result=new ArrayList<>();
        AtomicInteger count=new AtomicInteger(1);
        IntStream.range(0,input.length()).forEach(i->{
            if(i>0 && input.charAt(i)==input.charAt(i-1))
            {
                count.incrementAndGet();
            }
            else
            {
                if(i>0)
                {
                    result.add(String.valueOf(input.charAt(i-1))+count);
                }
                count.set(1);
            }
        });
        result.add(String.valueOf(input.charAt(input.length()-1))+count);
     String compressed=   result.stream().collect(Collectors.joining());
        System.out.println(compressed);
    }
}

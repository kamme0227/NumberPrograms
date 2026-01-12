package com.codesnippet;

import java.util.stream.IntStream;

public class FactorialNumber {

    public static void main(String[] args)
    {
        int n=5;

      long result=  IntStream.rangeClosed(2,n).reduce(1,(a,b)->a*b);

      System.out.println(result);
    }
}

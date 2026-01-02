package com.codesnippet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTargetSum {

    public static void main(String[] args)
    {
          int[] arr={10,20,30,40,50,60};

          int targetSum=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(StreamTargetSum::firstAndLastDigit))
                  .values().stream().mapToInt(StreamTargetSum::maxPairSum).max().orElse(-1);
          System.out.println(targetSum);
    }
    public static String firstAndLastDigit(int number)
    {
        String num=String.valueOf(number);
        return num.charAt(0)+" "+num.charAt(num.length()-1);
    }
    public static int maxPairSum(List<Integer> list)
    {
        if(list.size()<2)
        {
            return -1;
        }
        list.sort(Collections.reverseOrder());
        return list.get(0)+list.get(1);
    }
}

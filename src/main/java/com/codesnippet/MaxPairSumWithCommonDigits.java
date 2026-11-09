package com.codesnippet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxPairSumWithCommonDigits {

    public static void main(String[] args)
    {
        int[] arr={405, 45, 300, 300};

        int result= Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(MaxPairSumWithCommonDigits::firstAndLastDigit)).values().stream()
                .mapToInt(MaxPairSumWithCommonDigits::maxPairSum).max().orElse(-1);
        System.out.println(result);
    }

    private static String firstAndLastDigit(int num)
    {
        String strNum=String.valueOf(num);
        return strNum.charAt(0)+" "+strNum.charAt(strNum.length()-1);

    }
    private static int maxPairSum(List<Integer> list)
    {
        if(list.size()<2)
        {
            return -1;
        }
        Collections.sort(list);
        return list.get(0) + list.get(1);
    }
}

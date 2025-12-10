package com.codesnippet;

import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args)
    {
        int[] arr={1,2,4,5,6,7,8,9};

        int n=9;

        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        Arrays.sort(arr);

        for(int num:arr)
        {
             actualSum+=num;

        }
        int missingNumber=expectedSum-actualSum;

        System.out.println(missingNumber);

    }
}

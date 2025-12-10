package com.stringoperations;

import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args)
    {
        String str="suresh";
//        char[] arr=str.toCharArray();
//
//        int left=0;
//        int right=str.length()-1;
//
//        while (left<right)
//        {
//            char temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//
//            left++;
//            right--;
//        }
//
//        String reverseStr=new String(arr);
//        System.out.println(reverseStr);

        //Second Approach

        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

    }
}

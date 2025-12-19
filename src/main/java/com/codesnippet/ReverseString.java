package com.codesnippet;

public class ReverseString {

    public static void main(String[] args)
    {
        String s="suresh";

        char[] arr=s.toCharArray();

        int left=0,right=s.length()-1;

        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String reverseString=new String(arr);
        System.out.println(reverseString);
    }
}

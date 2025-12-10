package com;

import java.util.Arrays;

public class TargetSum {

    public static void main(String[] args)
    {
        int[] arr={1,-2,3,4,5,6,6,-7,9,11};
        int targetSum=7;
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while (left<right)
        {
            int sum=arr[right]+arr[left];
            if(sum==targetSum)
            {
                System.out.println("("+arr[left]+","+arr[right]+")");
                left++;
                right--;
            }
            else if(sum<targetSum)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

    }
}

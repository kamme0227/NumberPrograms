package com.codesnippet;

import java.util.Arrays;

public class TargetSum {

    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6,7,8,9,11};

        int targetSum=11;

        int left=0, right=arr.length-1;

        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==targetSum)
            {
                left++;
                right--;
                System.out.println(arr[right]+" "+arr[left]);
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

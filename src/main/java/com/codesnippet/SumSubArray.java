package com.codesnippet;

public class SumSubArray {

    public static int sumSubArray(int[] nums)
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num : nums)
        {
            currentSum+=num;
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0)
            {
                currentSum=0;
            }

        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6-2,-5,-7};
        System.out.println(sumSubArray(arr));
    }

}

package Streams;

import java.util.Arrays;

public class TargetSum {

    public static void main(String[] args)
    {
        int[] arr={2,11,15,-2,8,3};
        int targetSum=9;

        Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;

        while(left<right) {
            int sum = arr[left] + arr[right];
            if (sum == targetSum) {
                System.out.println("(" + arr[left] + "," + arr[right]+")");
                left++;
                right--;
            } else if (sum < targetSum) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}

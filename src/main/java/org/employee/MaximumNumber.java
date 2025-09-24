package org.employee;

public class MaximumNumber {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9};

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            if(num>max)
            {
                secondMax=max;
                max=i;
            }
            else if(num>secondMax && num!=max)
            {
                secondMax=num;

        }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}

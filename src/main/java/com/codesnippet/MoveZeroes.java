package com.codesnippet;

public class MoveZeroes {

    public static void main(String[] args)
    {
        int[] arr={0,2,1,2,0,3,0,4,0,6,0};
//        int index=0;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]!=0)
//            {
//                arr[index]=arr[i];
//                index++;
//            }
//        }
//        while (index<arr.length)
//        {
//            arr[index]=0;
//            index++;
//        }
//        for(int num:arr)
//        {
//            System.out.print( num );
//        }
//
        // Move zeroes to front

        int index=arr.length-1;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0) {
                arr[index] = arr[i];
                index--;
            }
        }
        while (index>=0)
        {
            arr[index]=0;
            index--;
        }
        for(int n:arr)
        {
            System.out.print(n+" ");
        }

    }
}

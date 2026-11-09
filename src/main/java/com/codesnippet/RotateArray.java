package com.codesnippet;

public class


RotateArray {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int count=3;

        int n=arr.length;

        count=count%n;
        for(int i=0;i<count;i++)
        {
            int first=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }


        for (int num:arr)
        {
            System.out.println(num);
        }
    }
}



//        //arr = 1 2 3 4 5
//        //count = 3
//        //output = 4 5 1 2 3
//
//        int[] arr={1,2,3,4,5};
//
//        int count=3;
//
//        int n=arr.length;
//
//        count=count%n;
//
//        for(int i=0;i<count;i++)
//        {
//            rotateOnce(arr);
//        }
//        for(int num:arr)
//        {
//            System.out.println(num);
//        }
//    }
//    private static void rotateOnce(int[] arr)
//    {
//        int first=arr[0];
//        for(int i=0;i<arr.length-1;i++)
//        {
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]=first;
//    }
//}

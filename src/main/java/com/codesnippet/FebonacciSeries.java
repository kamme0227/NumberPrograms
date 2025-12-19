package com.codesnippet;

public class FebonacciSeries {

    public static void main(String[] args)
    {
        int n=10;
        for (int i=0;i<n;i++)
        {
            System.out.println(getFebonacci(i));
        }
    }

    public static int getFebonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        return getFebonacci(n-1)+getFebonacci(n-2);
    }
}

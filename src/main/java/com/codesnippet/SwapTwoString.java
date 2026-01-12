package com.codesnippet;

public class SwapTwoString {

    public static void main(String[] args)
    {
        String s1="hello";
        String s2="world";

        System.out.println("Before swapping two strings "+ s1+" "+s2);
         s1=s1.concat(s2);
         s2=s1.substring(0,s1.length()-s2.length());
         s1=s1.substring(s2.length());
         System.out.println("After swapping two strings "+ s1+" "+s2);

        //using third variable

        String temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("After swapping two strings "+ s1+" "+s2);

        //swap two strings without third variable

        s1=s1.concat(s2);
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

    }


}

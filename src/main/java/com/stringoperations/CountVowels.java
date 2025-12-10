package com.stringoperations;

public class CountVowels {

    public static void main(String[] args)
    {
        String str="suresh";
        int count=0;

        //count vowels
        //Approach 1

//        Long count=str.chars().filter(s->"aeiou".indexOf(s)!=-1).count();
//
//        System.out.println(count);

        //Approach 2

        char[] arr=str.toCharArray();

        String vowels="aeiou";


        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(vowels.indexOf(ch)!=-1)
            {
                count++;
            }

        }
        System.out.println(count);

    }
}

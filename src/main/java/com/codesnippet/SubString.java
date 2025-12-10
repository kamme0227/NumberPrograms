package com.codesnippet;

import java.util.HashSet;

public class SubString {

    public static void main(String[] args)
    {
        String s="abcabcdabc";

        String result=subString(s);
        System.out.println(result);
    }

    public static String subString(String str)
    {
        int left=0,right=0,max=0;
        int startingIndex=0;

        HashSet<Character> set=new HashSet<>();

        while(right<str.length())
        {
            if(!set.contains(str.charAt(right)))
            {
                set.add(str.charAt(right));
                if(set.size()>max)
                {
                    max=set.size();
                    startingIndex=left;
                }
                right++;
            }
            else
            {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return str.substring(startingIndex,startingIndex+max);
    }
}

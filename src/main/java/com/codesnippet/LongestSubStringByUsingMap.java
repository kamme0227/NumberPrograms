package com.codesnippet;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringByUsingMap {

    public static void main(String[] args)
    {
        String str="pwwkeyw";
        System.out.println(getSubString(str));

    }
    private static String getSubString(String input)
    {
        Map<Character, Integer> keyIndex=new HashMap<>();

        int start=0;                   //starting position of index
        int subStringlength=0;
        String longestSubString="";
        for(int current=0;current<input.length();current++)
        {
            char charIndex=input.charAt(current);
            if(keyIndex.containsKey(charIndex) && keyIndex.get(charIndex)>=start)
            {
                start=keyIndex.get(charIndex)+1;

            }
            keyIndex.put(charIndex,current);
            int currentSubStingLength=current-start+1;
            if(currentSubStingLength>subStringlength)
            {
                subStringlength=currentSubStingLength;
                longestSubString=input.substring(start,current+1);
            }
        }
        return longestSubString;
    }
}

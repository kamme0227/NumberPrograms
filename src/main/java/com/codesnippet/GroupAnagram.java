package com.codesnippet;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagram {
    public static void main(String[] args)
    {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));

    }
    private static List<List<String>> groupAnagrams(String[] arr)
    {
        Map<String,List<String>> map=new HashMap<>();

        for(String s:arr)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            map.putIfAbsent(key,new ArrayList<>() );
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}

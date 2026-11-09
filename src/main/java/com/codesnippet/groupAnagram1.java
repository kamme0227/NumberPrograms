package com.codesnippet;

import java.lang.reflect.Array;
import java.util.*;

public class groupAnagram1 {

    public static void main(String[] args)
    {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map=new HashMap<>();

        for(String s:arr)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        System.out.println(map.values());

    }
}

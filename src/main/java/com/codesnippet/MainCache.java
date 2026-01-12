package com.codesnippet;

import java.security.Key;

public class MainCache
{
    public static void main(String[] args)
    {
        LRUCache<Integer,String> cache=new LRUCache<>(3);
        cache.put(1,"1");
        cache.put(2,"2");
        cache.put(3,"3");
        cache.put(4,"4");

        cache.print();
    }
}

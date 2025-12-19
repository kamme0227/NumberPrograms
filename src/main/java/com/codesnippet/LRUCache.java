package com.codesnippet;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {

    private final int capacity;

    private final Map<K,V> cache;

    LRUCache(int capacity)
    {
        this.capacity= capacity;
        this.cache= new LinkedHashMap<>();
    }

    public V get(K key)
    {
        return this.cache.getOrDefault(key,null);
    }
    public void put(K key,V value)
    {
        if(!cache.containsKey(key) && cache.size()>=this.capacity)
        {
            K leastRecentlyUsed=this.cache.keySet().iterator().next();
            this.cache.remove(leastRecentlyUsed);
        }
        this.cache.put(key,value);
    }
    public void print()
    {
        System.out.println("Map:"+cache);
    }
}


package Streams;

import lombok.Synchronized;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSync {
    public static void main(String[] args)
    {
        Set<String> hset=new HashSet<>();
        hset.add("suresh");
        hset.add("anusha");

        Set<String> sySet= Collections.synchronizedSet(hset);

        synchronized (sySet)
        {
            for(String s:sySet)
            {
                System.out.println(s);
            }
        }
    }
}

package com.started080426;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatedCharacterWithIndex {
    public static void main(String[] args) {

        String str = "Hello World";

        Map<Character, List<Integer>> map = IntStream.range(0,str.length()-1).boxed()
                .collect(Collectors.groupingBy(i->str.charAt(i),Collectors.toList()));
        Character firstChar = map.entrySet().stream().filter(entry->entry.getValue().size()>1).findFirst().get().getKey();

        System.out.println(firstChar);
        
    }
}

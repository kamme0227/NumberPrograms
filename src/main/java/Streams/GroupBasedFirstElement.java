package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBasedFirstElement {

    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("apple","banana","orange","mango","kiwi","apple");
        Map<Character,List<String>> result= groupByFirstElement(list);
        System.out.println(result);

    }
    public static Map<Character,List<String>> groupByFirstElement(List<String> input)
    {
        Map<Character,List<String>> groupBywords=input.stream().collect(Collectors.groupingBy(s->s.charAt(0)));

       // groupBywords.forEach((k,v)->System.out.println(k+" "+v));
        return groupBywords;
    }

}

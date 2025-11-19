package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionToRemoveDuplicates {
    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("Banana","Fruit","Mango","Orange","Banana","Grapes","Banana","Mango");
        String result=getDuplicates(list);
        System.out.println(result);


    }
       //Remove Duplicate Elements

    public static String getDuplicates(List<String> arr)
    {
//        Set<String> input=new HashSet<>();
//        Set<String> duplicates=arr.stream().filter(str->!input.add(str)).collect(Collectors.toSet());
//      //  duplicates.forEach(System.out::println);
//          return duplicates.toString();
        Map<String,Long> frquencywords=arr.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));
       // frquencywords.forEach((k,v)->System.out.println(k+" "+v));
        return frquencywords.toString();

    }
}

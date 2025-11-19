package Streams;

import com.filters.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateListOfString {

    public static void main(String[] args)
    {
        List<String> list1= Arrays.asList("banana","fruit","mango");

        String result=list1.stream().collect(Collectors.joining(","));
    }
}

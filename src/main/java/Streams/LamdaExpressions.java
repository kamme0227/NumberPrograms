package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdaExpressions {

    public static void main(String[] args)
    {
        // Java8 Features
        // 1. Lamda Expressions
        // 2. Stream API
        // 3. Optional Class
        // 4. Dafault method and static methods in interface
        // 5. New Date and Time API
        // 6. Method Reference
        // 7. Functional Interface
        // 8. Nashorn JavaScript Engine

        // 1. Lamda Expression

        Runnable runnableLamda=()->System.out.println("runnable");

        // 2. Functional Interface

        @FunctionalInterface
        interface MyFunction
        {
            void perform();
        }

        // How do you define a lamda Expression for a functional interface

        MyFunction function=()->System.out.println("performing the action");
        function.perform();

        // What is the Stream API in java 8

        List<Integer> streamApi= Arrays.asList(1,2,4,6,7,8,9);

        List<Integer> stream=streamApi.stream().filter(n->n%2==0).collect(Collectors.toList());

        stream.forEach(System.out::println);

        // What is difference between Stream and collections

        // Collections-> Storing the data like list,set.
        // Stream-> Streams are loading the data lazily, does not store data and perform the actions like functional style.

        //How do you create a stream in java8

        // Streams can be created from collections,arrays, or using stream.of()

        Stream<String> stm=Stream.of("a","b","c");
        List<String> list1=Arrays.asList("a","b","c");


        // What is optional class in java8?

        //Optional is a container object  that may or may not contain a non-null value, used to avoid the nullpointerexception.

        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(System.out::println);

        // How do you handle null checks using Optional

        String name="Hellow";
        Optional<String> optionalName=Optional.ofNullable(name);
        String result =optionalName.orElse("Default name");
        System.out.println(result);


        // how do you use map function in stream

        List<String> l=Arrays.asList("a","b","c");
        List<String> mapFunction=l.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(mapFunction);

        //Convert the stream into array by using toArray method

        List<Integer> num=Arrays.asList(1,2,3,4,5);

        Integer[] array=num.stream().toArray(Integer[]::new);

     }
}

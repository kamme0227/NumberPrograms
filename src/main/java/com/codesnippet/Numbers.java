package com.codesnippet;

import com.employee.Main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Numbers {


    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,4,6,7,9,8,4,2,12,10,20);

        //Filter even numbers

        List<Integer> evenNumbers=list.stream().filter(n->n%2==0).distinct().sorted().collect(Collectors.toList());

        System.out.println(evenNumbers);

        // list by their squares

        List<Integer> squares=list.stream().map(n->n*n).collect(Collectors.toList());

        System.out.println(squares);

        //square even numbers

        List<Integer> squareEvenNumbers=list.stream().filter(n->n%2==0).map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(squareEvenNumbers);

        //fiter numbers greater than 10

        Optional<Integer> numberGreaterThan10=list.stream().filter(n->n>10).findFirst();

        System.out.println(numberGreaterThan10);

        //Count how many numbers greater than 5

           Long count=list.stream().filter(n->n>5).count();

           System.out.println(count);

           //find th sum/product of all the numbers in list

        Integer sum=list.stream().mapToInt(n->n).sum();

        System.out.println(sum);

        //product of all numbers

        Integer product =list.stream().reduce(1,(a,b)->a*b);

        System.out.println(product);

        //find sum of even numbers in list

        Integer evenSum=list.stream().filter(n->n%2==0).reduce(0,(a,b)->a+b);

        System.out.println(evenSum);

        //find maximum number in a list

        Optional<Integer> maximumNumber=list.stream().max(Comparator.comparing(n->n));

        System.out.println(maximumNumber);

        //second approach

        Integer maxNumber=list.stream().reduce(0,Integer::max);

        System.out.println(maxNumber);

        //sum of squares of even numbers

        Integer squareEvenNumbersSum=list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);

        System.out.println(squareEvenNumbersSum);

        //remove duplicate elements

        Set<Integer> hashSet=new HashSet<>();

        Set<Integer> duplicates=list.stream().filter(n->!hashSet.add(n)).collect(Collectors.toSet());

        duplicates.forEach(System.out::println);

        //find the average of all numbers in a list

        double averageOfAllNumber=list.stream().mapToInt(n->n).average().orElse(0.0);

        System.out.println(averageOfAllNumber);

        //sort the list of integers ascending order and descending order

        List<Integer> orders=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(orders);

        //check all numbers are positive

        boolean positiveNumber=list.stream().allMatch(n->n>0);

        System.out.println(positiveNumber);

        //check anynumber is divisible by 3

        boolean numberCheck=list.stream().anyMatch(n->n%3==0);

        System.out.println(numberCheck);

        //second highest number

       Optional secondMax= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

       System.out.println(secondMax);

       //Partision even and odd numbers in a list

        Map<Boolean,List<Integer>> evenOdd=list.stream().collect(Collectors.partitioningBy(n->n%2==0, Collectors.toList()));

        List<Integer> even=evenOdd.get(true);
        List<Integer> odd=evenOdd.get(false);

        System.out.println(even);
        System.out.println(odd);


        //count occurence each element in a list

        Map<Integer,Long> occurencesEachElement=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        occurencesEachElement.forEach((k,v)->System.out.println(k+" "+v));


        //given a list of integers, compute the average of every 3 elements sliding window

//        int window=3;
//
//        List<Double> computeElements= IntStream.range(0,list.size()-(window-1)).mapToObj(i->list.subList(i,i+window)).map(w->w.stream().mapToInt(Integer::intValue).average().orElse(0.0)).toList();
//
//        System.out.println(computeElements);


//        int window=3;
//
//        List<Double> averageOfWindowElements=IntStream.range(0,list.size()-(window-1))
//                .mapToObj(i->list.subList(i,i+window)).map(w->w.stream().mapToInt(Integer::intValue).average().orElse(0.0)).toList();
//
//        System.out.println(averageOfWindowElements);




    }
}

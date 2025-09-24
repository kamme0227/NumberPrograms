package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9,10);

        Map<Boolean, Integer> sum = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.summingInt(Integer::intValue)));

        int sumEven = sum.get(true);
        int sumOdd = sum.get(false);

        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}

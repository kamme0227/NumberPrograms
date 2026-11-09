package com.quorainterviewpreparation;

import java.awt.desktop.OpenFilesEvent;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondMax {

    public static void main(String[] args)
    {
     int[] arr1= {1, 2, 4, 7, 5, 3, 8};
     int[] arr2={1};
     int[] arr3={1,2};
     getSecondMax(arr1);
     getSecondMax(arr2);
     getSecondMax(arr3);


    }
    private static void getSecondMax(int[] arr)
    {
        Optional secondMax=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        secondMax.ifPresent(System.out::println);
    }
}

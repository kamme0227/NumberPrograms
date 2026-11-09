package com.codesnippet;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OrbitaryInteger {

    public static void main(String[] args)
    {
        int[] arr = {7, 1, 0, 1, 3, 1, 4};
        // output -> {1, 1, 1, 7, 0, 3, 4}

        int[] original=arr.clone();

        int index = 0;

        // First pass: move all 1s to front
        for (int i = 0; i < original.length; i++) {
            if (original[i] == 1)
                arr[index++] = 1;
        }

        // Second pass: move remaining elements
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 1) {
                arr[index++] = original[i];
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num+",");
        }

        //Stream Approach

        int[] arr1 = {7, 1, 0, 1, 3, 1, 4};

        int[] result= IntStream.concat(Arrays.stream(arr1).filter(n->n==1), Arrays.stream(arr1).filter(n->n!=1)).toArray();

        System.out.println(Arrays.toString(result));


    }
}

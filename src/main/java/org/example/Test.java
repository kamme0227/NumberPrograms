package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

//   public static int factorial(int n)
//   {
//       if(n==0)
//       {
//           return 1;
//       }
//       return n*factorial(n-1);
//   }
//   public static void main(String[] args)
//   {
//       System.out.println(factorial(5));
//   }

    public static void main(String[] args) {


        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));

        List<String> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(flatList);
    }
}

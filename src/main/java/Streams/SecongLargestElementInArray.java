package Streams;

import java.util.Arrays;
import java.util.Optional;

//
public class SecongLargestElementInArray {
    //
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 76, 8, 9};
//
//        int firstLargest=Integer.MIN_VALUE;
//        int secondLargest=Integer.MIN_VALUE;
//
//        for(int num:arr)
//        {
//            if(num>firstLargest)
//            {
//                secondLargest=firstLargest;
//                firstLargest=num;
//            }
//            else if(num>secondLargest && num!=firstLargest)
//            {
//                secondLargest=num;
//            }
//        }
//        System.out.println(firstLargest+" "+secondLargest);

        int secondLargest = Arrays.stream(arr).distinct().boxed().sorted((a,b)->b-a).skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("No Second largest Element"));
        System.out.println(secondLargest);
    }
}
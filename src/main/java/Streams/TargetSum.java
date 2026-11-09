package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  TargetSum {

    public static void main(String[] args)
    {
        int[] arr={2,11,15,-2,8,3};
        int targetSum=9;

//        Arrays.sort(arr);
//
//        int left=0;
//        int right=arr.length-1;
//
//        while(left<right) {
//            int sum = arr[left] + arr[right];
//            if (sum == targetSum) {
//                System.out.println("(" + arr[left] + "," + arr[right]+")");
//                left++;
//                right--;
//            } else if (sum < targetSum) {
//                left++;
//            }
//            else {
//                right--;
//            }
//        }
        // Stream Approach

        List<String> list= IntStream.range(0,arr.length).boxed()
                .flatMap(i->IntStream.range(i+1,arr.length-1)
                        .filter(j->arr[j]+arr[i]==targetSum)
                        .mapToObj(j->arr[i]+""+arr[j])).collect(Collectors.toList());
        System.out.println(list);
    }
}

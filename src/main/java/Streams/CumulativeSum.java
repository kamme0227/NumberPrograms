package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CumulativeSum {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        System.out.println(getCumulativeSum(list));
    }

    public static List<Integer> getCumulativeSum(List<Integer> input)
    {
        List<Integer> cumulativeSum=new ArrayList<>();

        int sum=0;
        for(int numbers:input)
        {
            sum+=numbers;
            cumulativeSum.add(sum);
        }

        return cumulativeSum;
    }
}

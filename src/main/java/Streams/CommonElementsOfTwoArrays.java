package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsOfTwoArrays {
    public static void main(String[] args)
    {
        String[] arr1={"java","interview","questions","for","experience"};
        String[] arr2={"java","interview","questions","fresher"};
//        Set<String> result=new HashSet<>();
//        for(String str1: arr1)
//        {
//            for(String str2:arr2)
//            {
//                if(str1==str2)
//                {
//                    result.add(str1);
//                    break;
//                }
//
//            }
//        }
//        for(String s:result)
//        {
//            System.out.println(s);
//        }

        //stream approach
//        Set<String> commonElements=new HashSet<>(Arrays.asList(arr2));
//        List<String> list=Arrays.stream(arr1).filter(x->commonElements.contains(x)).collect(Collectors.toList());
//        System.out.println(list);

        // find uncommon elements

        Set<String> set=new HashSet<>(Arrays.asList(arr2));
        List<String> list=Arrays.stream(arr1).filter(s->!(set.contains(s) && set.contains(s))).collect(Collectors.toList());
        System.out.println(list);


    }
}

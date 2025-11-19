package Streams;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsOfTwoArrays {
    public static void main(String[] args)
    {
        String[] arr1={"java","interview","questions","for","experience"};
        String[] arr2={"java","interview","questions","fresher"};
        Set<String> result=new HashSet<>();
        for(String str1: arr1)
        {
            for(String str2:arr2)
            {
                if(str1==str2)
                {
                    result.add(str1);
                    break;
                }

            }
        }
        for(String s:result)
        {
            System.out.println(s);
        }
    }
}

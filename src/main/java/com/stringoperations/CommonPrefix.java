package com.stringoperations;

import java.util.List;

public class CommonPrefix {

    public static String commonPrefixAllString(String[] str)
    {
        if(str==null || str.length==0)
        {
            return "";
        }
        String prefix=str[0];
        for(int i=1;i< str.length;i++)
        {
            while (!str[i].startsWith(prefix))
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        String[] arr={"flower","flight","flow"};
        System.out.println(commonPrefixAllString(arr));
    }

}

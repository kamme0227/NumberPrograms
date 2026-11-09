package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterWords {

    public static String[] filterWords(String[] words,String letters)
    {
        List<String> result=new ArrayList<>();
        for(String word:words)
        {
            for(char ch:word.toCharArray())
            {
                if(letters.indexOf(ch)!=-1)
                {
                    result.add(word);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }
    public static void main(String[] args)
    {
        String[] words={"java","springboot","python","the"};
        String letters="ae";

        System.out.println(Arrays.toString(filterWords(words, letters)));
    }
}

package strings;

import java.util.Arrays;
import java.util.List;

public class DecodeStrings {

    public static StringBuilder decodeStr(List<String> words,String message)
    {
        StringBuilder result=new StringBuilder();
        String[] messageWords=message.split(" ");
        for(String word:words)
        {
            if(words.contains(word))
            {
                result.append(word).append(" ");
            }
            else
            {
                for(String correctWords:messageWords)
                {
                    if(isAnagram(correctWords, Arrays.toString(messageWords)))
                    {
                        result.append(correctWords).append(" ");
                    }
                }
            }
        }
        return result;

    }
    public static boolean isAnagram(String str1,String str2)
    {

          char[] arr1=str1.toCharArray();
          char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args)
    {
        List<String> words=Arrays.asList("hello","what","you","are","doing","today");
        String messageWords="hello what are diong today";
        System.out.println(decodeStr(words,messageWords));
    }
}

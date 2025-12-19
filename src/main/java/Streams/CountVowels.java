package Streams;

import java.awt.image.ImageProducer;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountVowels {

    public static void main(String[] args)
    {
        String input="suresh".toLowerCase();

        //Given String count vowels

        String vowels=input.chars().mapToObj(c->(char) c).filter(ch->"aeiou".indexOf(ch)!=-1).map(String::valueOf)
               .collect(Collectors.joining());

        System.out.println(vowels);

       //Count the vowels

        Map<Character,Long> countVowels=input.chars().mapToObj(c->(char)c).filter(e->"aeiou".indexOf(e)==-1)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

        countVowels.forEach((k,v)->System.out.println(k+" "+v));

        // vowels index positions

        IntStream.range(0,input.length()-1).filter(ch->"aeiou".indexOf(input.charAt(ch))==-1).forEach(k->System.out.println(input.charAt(k)+"vowels index positions"+k));


        // reverse a string without using built in method

        char[] charArray=input.toCharArray();

        int left=0;
        int right=input.length()-1;

        while(left<right)
        {
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
         String reverse=new String(charArray);
        System.out.println(reverse);
    }
}

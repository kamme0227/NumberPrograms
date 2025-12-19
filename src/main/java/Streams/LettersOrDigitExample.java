package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LettersOrDigitExample {
    public static void main(String[] args)
    {
        List<String> input= Arrays.asList("12Suresh","Suresh","21Naresh","Mango","34fruits","15banana");

        // I need to get the string starting with numbers

        List<String> startingLetterStrings=input.stream()
                .filter(str->!str.isEmpty() && Character.isDigit(str.charAt(0))).collect(Collectors.toList());

        System.out.println(startingLetterStrings);
    }
}

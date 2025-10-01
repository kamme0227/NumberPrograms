package Streams;

import java.util.stream.IntStream;

public class Palidrome {
    public static void main(String[] args)
    {
        String input="racecar";

        boolean polidrome= IntStream.range(0,input.length()/2).allMatch(i->input.charAt(i)==input.charAt(input.length()-i-1));
        System.out.println(input+"palidrome?"+polidrome);
    }
}

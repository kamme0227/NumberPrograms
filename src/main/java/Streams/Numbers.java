package Streams;

import org.example.Integers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Numbers {

    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(50,10,4,20,14,9,10);

      Double greaterThanTen= list.stream().filter(n->n>10).mapToInt(c->c).average().orElse(0);
    }
}

package com.codesnippet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("hello", "hhhhhiii", "hahahah", "java", "hhhh", "health", "hhhhello");

        List<String> filterString=list.stream().filter(s->s.length()>4).filter(s->s.chars().filter(ch->ch=='h').count()>2)
                .collect(Collectors.toList());

        System.out.println(filterString);
    }
}



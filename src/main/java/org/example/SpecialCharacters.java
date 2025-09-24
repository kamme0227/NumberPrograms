package org.example;

import javax.xml.stream.events.Characters;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialCharacters {

    public static void main(String[] args)
    {
        String input=" ";

        List<Character> specialCharacter=input.chars().mapToObj(c->(char)c).filter(c->!Character.isLetterOrDigit(c))
                .collect(Collectors.toList());

        System.out.println(specialCharacter);
    }
}

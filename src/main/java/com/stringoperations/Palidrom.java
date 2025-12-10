package com.stringoperations;

import java.util.stream.IntStream;

public class Palidrom {
    public static void main(String[] args) {
        String str = "suresh";

        boolean isPalidrom = IntStream.range(0, str.length() / 2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        System.out.println(isPalidrom);
    }
}

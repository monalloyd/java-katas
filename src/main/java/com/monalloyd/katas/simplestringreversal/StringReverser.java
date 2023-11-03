package com.monalloyd.katas.simplestringreversal;

import java.util.Iterator;
import java.util.stream.IntStream;

public class StringReverser {
    public String reverseWithoutMovingWhiteSpaces(String s){
        StringBuilder reversed = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> reversed.insert(j, ' '));
        return reversed.toString();
    }
}

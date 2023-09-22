package com.monalloyd.katas.simplestringreversal;

import java.util.Iterator;
import java.util.stream.IntStream;

public class StringReverser {
    public String reverseWithoutMovingWhiteSpaces(String s){
        String sb = new StringBuilder(s.replace(" ", "")).reverse().toString();
        Iterator reverseChars = sb.chars().mapToObj(i -> (char) i).iterator();
        StringBuilder output = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == ' '){
                output.append(' ');
            } else {
                output.append(reverseChars.next());
            }
        }

        return output.toString();
    }

    public String solve(String s){
        StringBuilder reversed = new StringBuilder(s.replaceAll(" ", "")).reverse();
        IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .forEach(j -> reversed.insert(j, ' '));
        return reversed.toString();
    }
}

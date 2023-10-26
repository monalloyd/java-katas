package com.monalloyd.katas.mexicanwave;

import java.util.stream.IntStream;

public class WaveGenerator {
    public String[] generate(String str) {
        return IntStream.range(0, str.length())
                .filter(i -> Character.isLetter(str.charAt(i)))
                .mapToObj(i -> str.substring(0, i).toLowerCase() +
                        Character.toUpperCase(str.charAt(i)) +
                        str.substring(i + 1).toLowerCase())
                .toArray(String[]::new);
    }
}

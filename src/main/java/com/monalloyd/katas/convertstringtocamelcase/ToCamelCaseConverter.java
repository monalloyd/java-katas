package com.monalloyd.katas.convertstringtocamelcase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToCamelCaseConverter {
    public String toCamelCase(String str){
        String[] words = str.split("[-_\\s]");
        return words[0] + Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining());
    }
}

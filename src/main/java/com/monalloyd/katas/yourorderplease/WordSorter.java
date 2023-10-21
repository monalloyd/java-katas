package com.monalloyd.katas.yourorderplease;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WordSorter {
    public String order(String text) {
        return Arrays.stream(text.split(" "))
                .sorted(Comparator.comparing(word -> word.replaceAll("\\D+", "")))
                .collect(Collectors.joining(" "));
    }
}

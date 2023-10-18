package com.monalloyd.katas.countingduplicates;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicatesCounter {
    public int duplicateCount(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(set -> set.getValue() > 1)
                .count();
    }
}

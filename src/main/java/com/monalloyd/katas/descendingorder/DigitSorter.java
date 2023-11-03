package com.monalloyd.katas.descendingorder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigitSorter {
    public int sortDesc(int num) {
        return Integer.parseInt(Stream.of(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}

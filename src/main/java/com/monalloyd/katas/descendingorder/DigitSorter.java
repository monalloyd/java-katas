package com.monalloyd.katas.descendingorder;

import java.util.Arrays;
import java.util.Comparator;

public class DigitSorter {
    //Integer.parseInt(Stream.of(String.valueOf(num).split(""))
    //        .sorted(Comparator.reverseOrder())
    //        .collect(Collectors.joining()))
    public int sortDesc(int num) {
        return Arrays.stream(Integer.toString(num).split(""))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .reduce(0, (acc, curr) -> acc * 10 + curr);
    }
}

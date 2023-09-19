package com.monalloyd.katas.onesandzeroes;

import java.util.List;
import java.util.stream.Collectors;

public class BinaryToIntConverter {
    public int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(
                binary.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining()
                ), 2);
    }
}

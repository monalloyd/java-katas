package com.monalloyd.katas.rgbtohexconversion;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RGBtoHexConverter {
    public String convert(int r, int g, int b) {
        return IntStream.of(r, g, b)
                .map(c -> Math.min(255, Math.max(0, c)))
                .mapToObj(c -> Integer.toHexString(c))
                .map(c -> c.length() == 1 ? "0" + c : c)
                .collect(Collectors.joining())
                .toUpperCase();
    }

    //Different solution:

    /*r = Math.min(255, Math.max(0, r));
    g = Math.min(255, Math.max(0, g));
    b = Math.min(255, Math.max(0, b));
    return String.format("%02X%02X%02X", r, g, b);*/
}

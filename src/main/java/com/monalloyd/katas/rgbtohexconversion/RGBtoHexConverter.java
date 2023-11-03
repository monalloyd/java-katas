package com.monalloyd.katas.rgbtohexconversion;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RGBtoHexConverter {
    public String convert(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

package com.monalloyd.katas.bitcounting;

import java.util.stream.Stream;

public class BitCounter {
    //more efficient solution: return Integer.bitCount(n);
    public int countBits(int n) {
        return (int) Stream.of(Integer.toBinaryString(n).split(""))
                .filter(digit -> Integer.parseInt(digit) == 1).count();
    }
}

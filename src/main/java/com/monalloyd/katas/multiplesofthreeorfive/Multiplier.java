package com.monalloyd.katas.multiplesofthreeorfive;

import java.util.stream.IntStream;

public class Multiplier {
    public int multiply(int number) {
        return IntStream.range(0, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}

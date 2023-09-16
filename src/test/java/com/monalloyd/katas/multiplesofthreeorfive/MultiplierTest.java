package com.monalloyd.katas.multiplesofthreeorfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MultiplierTest {
    Multiplier multiplier = new Multiplier();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "0, 1",
            "3, 4",
            "8, 6",
            "23, 10",
    })
    void multiply(int expected, int number) {
        int actual = multiplier.multiply(number);
        Assertions.assertEquals(expected, actual);
    }
}
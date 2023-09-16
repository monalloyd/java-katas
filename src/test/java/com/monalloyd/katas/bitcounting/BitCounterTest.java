package com.monalloyd.katas.bitcounting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BitCounterTest {
    BitCounter bitCounter = new BitCounter();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 10",
            "5, 1234"
    })
    void countBits(int expected, int n) {
        int result = bitCounter.countBits(n);
        assertEquals(expected, result);
    }
}
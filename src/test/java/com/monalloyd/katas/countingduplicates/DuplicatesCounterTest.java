package com.monalloyd.katas.countingduplicates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesCounterTest {
    DuplicatesCounter counter = new DuplicatesCounter();

    @ParameterizedTest
    @CsvSource({
            "0, ''",
            "0, '1'",
            "0, a",
            "0, a1B",
            "1, aA",
            "1, abh75fmb",
            "2, aabAaBbAc"
    })
    void duplicateCount(int expected, String text) {
        int result = counter.duplicateCount(text);

        assertEquals(expected, result);
    }
}
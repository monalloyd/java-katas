package com.monalloyd.katas.ascenddescendrepeat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DigitScaleCreatorTest {
    DigitScaleCreator creator = new DigitScaleCreator();

    @ParameterizedTest
    @CsvSource({
            "'', 0, 0, 0",
            "'', 0, 1, 2",
            "'', 1, 2, 1",
            "'11', 2, 1, 1",
            "'01010', 5, 0, 1",
            "'-1010-', 6, -1, 1"
    })
    void create(String expected, int length, int minimum, int maximum) {
        String result = creator.create(length, minimum, maximum);

        assertEquals(expected, result);
    }
}
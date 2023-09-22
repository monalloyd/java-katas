package com.monalloyd.katas.simplestringreversal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {
    StringReverser reverser = new StringReverser();

    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "a, a",
            "ab, ba",
            "a b, b a",
            "ab c, cb a"
    })
    void reverseWithoutMovingWhiteSpaces(String expected, String str) {
        String result = reverser.reverseWithoutMovingWhiteSpaces(str);
        assertEquals(expected, result);
    }
}
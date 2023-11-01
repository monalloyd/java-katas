package com.monalloyd.katas.backspacesinstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringBackspaceHandlerTest {
    StringBackspaceHandler handler = new StringBackspaceHandler();

    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "'', #",
            "'', a#",
            "a, a",
            "a, #a",
            "a, ab#",
            "b, a##b"
    })
    void cleanString(String expected, String text) {
        String result = handler.cleanString(text);

        assertEquals(expected, result);
    }
}
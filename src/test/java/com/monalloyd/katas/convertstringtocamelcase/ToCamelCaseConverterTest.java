package com.monalloyd.katas.convertstringtocamelcase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ToCamelCaseConverterTest {
    ToCamelCaseConverter converter = new ToCamelCaseConverter();

    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "'aaa', 'aaa'",
            "'aaaAaa', 'aaa_aaa'",
            "'aaaAaa', 'aaa-aaa'",
            "'AaaAaa', 'Aaa_Aaa'",
            "'AaaAaa', 'Aaa-aaa'"
    })
    void toCamelCase(String expected, String text) {
        String result = converter.toCamelCase(text);

        assertEquals(expected, result);
    }
}
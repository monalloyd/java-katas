package com.monalloyd.katas.stopspinningmywords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordSpinnerTest {
    WordSpinner wordSpinner = new WordSpinner();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("noice", "ecion"),
                Arguments.of("Hey dudes", "Hey sedud"),
                Arguments.of("This is a test", "This is a test"),
                Arguments.of("Hey fellow warriors", "Hey wollef sroirraw")
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void spin(String expected, String str) {
        String result = wordSpinner.spin(str);
        assertEquals(expected, result);
    }
}
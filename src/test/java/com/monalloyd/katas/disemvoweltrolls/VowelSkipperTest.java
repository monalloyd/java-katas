package com.monalloyd.katas.disemvoweltrolls;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VowelSkipperTest {
    VowelSkipper vowelSkipper = new VowelSkipper();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("", "a"),
                Arguments.of("", "A"),
                Arguments.of("b", "b"),
                Arguments.of("B", "B"),
                Arguments.of("Ll", "Lol"),
                Arguments.of("k ll", "ok lol")
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void skip(String expected, String text) {
        String result = vowelSkipper.skip(text);
        assertEquals(expected, result);
    }
}
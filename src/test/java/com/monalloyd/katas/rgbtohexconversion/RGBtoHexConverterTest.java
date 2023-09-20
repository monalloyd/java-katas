package com.monalloyd.katas.rgbtohexconversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RGBtoHexConverterTest {
    RGBtoHexConverter converter = new RGBtoHexConverter();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("000000", 0, 0, 0),
                Arguments.of("000000", -5, -7, -1),
                Arguments.of("FEFDFC", 254, 253, 252),
                Arguments.of("FFFFFF", 255, 256, 255)
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void convert(String expected, int r, int g, int b) {
        String result = converter.convert(r, g, b);
        assertEquals(expected, result);
    }
}
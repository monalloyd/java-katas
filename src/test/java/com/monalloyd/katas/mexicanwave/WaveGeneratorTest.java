package com.monalloyd.katas.mexicanwave;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class WaveGeneratorTest {
    WaveGenerator generator = new WaveGenerator();

    public static Stream<Arguments> params() {
        return Stream.of(
                of(new String[]{}, ""),
                of(new String[]{"A"}, "a"),
                of(new String[]{"Ab", "aB"}, "AB"),
                of(new String[]{" Ab cde ", " aB cde ", " ab Cde ", " ab cDe ", " ab cdE "},
                        " ab cde ")
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void generate(String[] expected, String text) {
        String[] result = generator.generate(text);

        assertArrayEquals(expected, result);
    }
}